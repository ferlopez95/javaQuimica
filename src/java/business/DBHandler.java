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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class DBHandler {
    private static Connection connection;

    public DBHandler() {
        try {
            System.out.println("1");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/catalogoquimica", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList getCatalogo() {
        ArrayList list = new ArrayList();
        try {            
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM Catalogo ");
            while (results.next()) {
                String Id =results.getString(1);
                String descripcion =results.getString(2);
                String capacidad =results.getString(3);
                String marca =results.getString(4);
                String status =results.getString(5);
                String cantidad =results.getString(6);

                Catalogo catalogo = new Catalogo(descripcion,capacidad,marca,status,cantidad,Id);
                list.add(catalogo);
            }
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
