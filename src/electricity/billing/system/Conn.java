
package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        // Correct format
c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "nitupartik");

        s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
