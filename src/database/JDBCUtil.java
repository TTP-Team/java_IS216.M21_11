
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCUtil {
    public static Connection getConnection(){
       try {
//           final String url = "jdbc:oracle:thin:@localhost:1521/tptsport";
//           final String user = "admin_tpt";
//           final String password = "12345";
           final String url = "jdbc:oracle:thin:@localhost:1521/orcl";
           final String user = "c##admin_tpt";
           final String password = "admin123";
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection(url, user, password);
           return con;
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
       }catch(SQLException e){
           e.printStackTrace();
       }
       return null;
    }
}    