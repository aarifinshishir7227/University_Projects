/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author disgust
 */
import java.sql.*;
import javax.swing.*;
public class Javaconnect {
    Connection conn = null;
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("JDBC:sqlite:E:\\aarifin\\mobile\\NetBeansProjects\\project123\\project123.sqlite");
            JOptionPane.showMessageDialog(null, "connection Established ");
            return conn;
        }catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
