/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/**
 *
 * @author Fernando
 */
public class DBHandler {

    public static boolean usuarioValido = true;

    /*public DBHandler() {
        try {
            System.out.println("1");
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/catalogoquimica";
            Connection connection = DriverManager.getConnection(url, "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    private static Connection connection;

    public DBHandler() {
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost/catalogoquimica", "root", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Boolean getUser(User user) {
        try {
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT Usuario, Password FROM usuario");

            while (results.next()) {
                String login = results.getString(1);
                String password = results.getString(2);
                if (user.getNombre().equals(login) && user.getPassword().equals(password)) {
                    usuarioValido = true;
                    return true;
                }
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuarioValido = false;
        return false;
    }

    public static ArrayList getCatalogo(String categoria) {
        ArrayList list = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/catalogoquimica";
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement statement = connection.createStatement();

            ResultSet results = statement.executeQuery("SELECT * FROM catalogo WHERE Categoria= '" + categoria + "'");

            while (results.next()) {
                String Id = Integer.toString(results.getInt("ID_Catalogo"));
                String descripcion = results.getString("Descripcion");
                String capacidad = Integer.toString(results.getInt("Capacidad"));
                String marca = results.getString("Marca");
                String status = results.getString("Status");
                String cantidad = Integer.toString(results.getInt("Cantidad"));
                
                if( Integer.parseInt(cantidad) <= 0){
                    cantidad = "0";
                }

                Catalogo catalogo = new Catalogo(descripcion, capacidad, marca, status, cantidad, Id);
                list.add(catalogo);
            }
            statement.close();
            connection.close();
        } catch (Exception ex) {
            //Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        //return list;
        return list;
    }
     public static String getNumOrden() {
        String numOrden = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/catalogoquimica";
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement statement = connection.createStatement();

             ResultSet results = statement.executeQuery("SELECT MAX(NumOrden)+1 as numOrden FROM prestamo");
            
            while (results.next()) {
                numOrden = results.getString("numOrden");
                System.out.println(numOrden);
            }
            if(numOrden == null){
                numOrden = "1";
            }
            statement.close();
            connection.close();
        } catch (Exception ex) {
            //Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return numOrden;
    }

    public static void setPedido(String nombre, String Matricula, String Cantidad, String idProducto,String numOrden) {
        try {

            //Obtener fecha actual
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String fechaActual = (String) dateFormat.format(date);
            /////////////////////
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/catalogoquimica";
            Connection connection = DriverManager.getConnection(url, "root", "");

            Statement statement = connection.createStatement();

           
            System.out.println("INSERT INTO prestamo(Solicitante,NumOrden, Matricula, Fecha_Solicitud, Fecha_Entrega, Status, Cantidad,ID_Catalogo) VALUES ('" + nombre + "','" + numOrden + "','" + Matricula + "','" + fechaActual + "','0000-00-00 00:00:00' ,'Pedido', '" + Cantidad + "','" + idProducto + "' )");
            //Restar a la BD lo que se pidio
            String query1 = "UPDATE catalogo SET Cantidad = Cantidad - " + Cantidad + "   WHERE ID_Catalogo = '" + idProducto + "'";
            //Insertar en pedidos
            String query = " INSERT INTO prestamo(Solicitante,NumOrden, Matricula, Fecha_Solicitud, Fecha_Entrega, Status, Cantidad,ID_Catalogo) VALUES ('" + nombre + "','" + numOrden + "','" + Matricula + "','" + fechaActual + "','0000-00-00 00:00:00' ,'Pedido', '" + Cantidad + "','" + idProducto + "' )";
            statement.executeUpdate(query1);
            statement.executeUpdate(query);

            statement.close();
            connection.close();

        } catch (Exception ex) {
            System.out.println("Error");

            ex.printStackTrace();
        }
        //return list;
    }

    public static ArrayList getPedidos(String orden) {
        ArrayList list = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/catalogoquimica?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8";
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement statement = connection.createStatement();

            ResultSet results = statement.executeQuery("SELECT p.*,c.Descripcion FROM prestamo as p, catalogo as c WHERE p.ID_Catalogo = c.ID_Catalogo AND NumOrden= '" + orden + "'");

            while (results.next()) {
                String Id = Integer.toString(results.getInt("ID_Prestamo"));
                String solicitante = results.getString("Solicitante");
                String Matricula = results.getString("Matricula");
                String Fecha_Solicitud = results.getString("Fecha_Solicitud");
                String Fecha_Entrega = results.getString("Fecha_Entrega");
                String Status = results.getString("Status");
                String Cantidad = Integer.toString(results.getInt("Cantidad"));
                String ID_Catalogo = Integer.toString(results.getInt("ID_Catalogo"));
                String NombreCatalogo = results.getString("Descripcion");
                String NumOrden = results.getString("NumOrden");

                Prestamo prestamo = new Prestamo(Id, solicitante, Matricula, Fecha_Solicitud, Fecha_Entrega, Status,
                        Cantidad, ID_Catalogo, NombreCatalogo, NumOrden);
                list.add(prestamo);
            }
            statement.close();
            connection.close();
        } catch (Exception ex) {
            //Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        //return list;
        return list;
    }

    public static ArrayList getAllPedidos() {
        ArrayList list = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/catalogoquimica?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8";
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement statement = connection.createStatement();

            ResultSet results = statement.executeQuery("SELECT   p.*,c.Descripcion FROM prestamo as p, catalogo as c WHERE p.ID_Catalogo = c.ID_Catalogo GROUP BY NumOrden ORDER BY ID_Prestamo");

            while (results.next()) {
                String Id = Integer.toString(results.getInt("ID_Prestamo"));
                String solicitante = results.getString("Solicitante");
                String Matricula = results.getString("Matricula");
                String Fecha_Solicitud = results.getString("Fecha_Solicitud");
                String Fecha_Entrega = results.getString("Fecha_Entrega");
                String Status = results.getString("Status");
                String Cantidad = Integer.toString(results.getInt("Cantidad"));
                String ID_Catalogo = Integer.toString(results.getInt("ID_Catalogo"));
                String NombreCatalogo = results.getString("Descripcion");
                String NumOrden = results.getString("NumOrden");

                Prestamo prestamo = new Prestamo(Id, solicitante, Matricula, Fecha_Solicitud, Fecha_Entrega, Status,
                        Cantidad, ID_Catalogo, NombreCatalogo, NumOrden);
                list.add(prestamo);
            }
            statement.close();
            connection.close();
        } catch (Exception ex) {
            //Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        //return list;
        return list;
    }

    public static void updateStatusPedido(String orden, String Status) {
        try {

            //Obtener fecha actual
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String fechaActual = (String) dateFormat.format(date);
            /////////////////////
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/catalogoquimica";
            Connection connection = DriverManager.getConnection(url, "root", "");

            Statement statement = connection.createStatement();
            //Restar a la BD lo que se pidio
            String query = "UPDATE prestamo SET Status = '" + Status + "'WHERE  NumOrden = '" + orden + "'";
            //Insertar en pedidos
            statement.executeUpdate(query);

            statement.close();
            connection.close();

        } catch (Exception ex) {
            System.out.println("Error");

            ex.printStackTrace();
        }
        //return list;
    }

}
