import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDB {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:mydatabase.db";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // create patient table
            String sql = "CREATE TABLE IF NOT EXISTS Patient (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         "first_name TEXT NOT NULL, " +
                         "last_name TEXT NOT NULL, " +
                         "dob DATE NOT NULL," +
                         "gender TEXT NOT NULL CHECK(gender IN('Male', 'Female'))," +
                         "phone TEXT UNIQUE" +
                         ");";
            stmt.execute(sql);

            

            System.out.println("Patient table created.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
