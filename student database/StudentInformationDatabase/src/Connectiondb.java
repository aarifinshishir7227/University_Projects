
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aarifin
 */

public class Connectiondb {
    static Connection con = null;
    
    public static Connection connectdb() 
    {        
            String url = "jdbc:mysql://localhost:3306/student_information";
            String user = "root";
            String password = "root";

    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
       // JOptionPane.showMessageDialog(null, "connection established");
        return con;
    }
    catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
            return null;
    }
    }
    
    
}