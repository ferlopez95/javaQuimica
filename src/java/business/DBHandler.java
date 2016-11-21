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

    public static void setPedido(String nombre, String Matricula, String Cantidad, String idProducto) {
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
            System.out.println("INSERT INTO prestamo(Solicitante, Matricula, Fecha_Solicitud, Status, Cantidad,ID_Catalogo) VALUES ('" + nombre + "','" + Matricula + "','" + fechaActual+ "','' ,'Pedido', '" +Cantidad + "','" + idProducto + "' )");

           String query = " INSERT INTO prestamo(Solicitante, Matricula, Fecha_Solicitud, Fecha_Entrega, Status, Cantidad,ID_Catalogo) VALUES ('" + nombre + "','" + Matricula + "','" + fechaActual + "','0000-00-00 00:00:00' ,'Pedido', '" + Cantidad + "','" + idProducto + "' )";
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
