
package myConnection;
import java.sql.*;
public class DAOConnection { 
    
    public static Connection con=null ;
    public static Connection getConnection() throws ClassNotFoundException , SQLException
    {
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql:///bussystem","root","");
     return con;
    }
}
