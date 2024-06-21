/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author huawei
 */
public class ConnectionProvider {
    public static Connection conn()
    {
        try
        {
            String url = "jdbc:mysql://localhost:4306/nailtech_system";
            String user = "root";
            String password ="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            return conn;
        }
        catch(SQLException|ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        return null;
    }
            
    public static void main(String[] args) {
   
    }
}
