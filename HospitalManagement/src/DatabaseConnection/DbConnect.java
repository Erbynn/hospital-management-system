
package DatabaseConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class DbConnect {
    public static Connection Connect(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db","root","");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
} 
}
