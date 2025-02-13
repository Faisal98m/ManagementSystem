import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDB {
    public static void main(String[] args) {
        try {
            // load the sqlite-jdbc driver
            Class.forName("org.sqlite.JDBC");

            // connect to the database
            String url = "jdbc:sqlite:mydatabase.db"; 
            Connection conn = DriverManager.getConnection(url);

            System.out.println("Connected to SQLite database.");
            conn.close(); // close connection
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
