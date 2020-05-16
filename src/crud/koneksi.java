package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rohmat
 */
public class koneksi {
    Connection conn=null;
    private static final String user="root";
    private static final String password="";
    
     public  Connection konek()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java",user,password);
            if(conn !=null){
                //System.out.print("koneksi succes");
            }else {
               //System.out.print("koneksi gagal");   
            }
            return conn;
        }catch(SQLException e){
            //System.out.print(e.getMessage());
        }
        return null;
    }
}
