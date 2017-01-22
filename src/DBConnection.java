
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getDBConnection() {
        Connection connection;
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/buses";
            connection = DriverManager.getConnection(url,"root"," ");
            return connection;
        } catch (ClassNotFoundException ex) {
            return null;
        } catch (SQLException ex) {
            return null;
        } //try catch closed
        //try catch closed
    }//getDBConnection() closed
}//class closed
