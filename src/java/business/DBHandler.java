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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class DBHandler {

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
    
    public static ArrayList getCatalogo(String categoria) {
        ArrayList list = new ArrayList();
        try {            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/catalogoquimica";
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement statement = connection.createStatement();
            System.out.println("SELECT * FROM catalogo WHERE Categoria="+categoria);

            ResultSet results = statement.executeQuery("SELECT * FROM catalogo WHERE Categoria= '"+categoria+"'");

            while (results.next()) {
                String Id =Integer.toString(results.getInt("ID_Catalogo"));
                String descripcion =results.getString("Descripcion");
                String capacidad =Integer.toString(results.getInt("Capacidad"));
                String marca =results.getString("Marca");
                String status =results.getString("Status");
                String cantidad =Integer.toString(results.getInt("Cantidad"));

                Catalogo catalogo = new Catalogo(descripcion,capacidad,marca,status,cantidad,Id);
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
}
