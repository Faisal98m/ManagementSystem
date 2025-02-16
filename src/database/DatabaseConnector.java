package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/*Establis a connection with mydatabase.db
 * allow sql execution (CRUD)
 * allow queries (fethching from tables)/
 * close the connection properly when done.
 * 
 */

public class DatabaseConnector {

    private static final String URL = "jdbc:sqlite:C:/sqlite3/mydatabase.db";

    public static Connection connect(){
        Connection conn = null;

        try{
            
            conn = DriverManager.getConnection(URL);

            System.out.println("connection to sql has been established");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        
        }
        return conn;
    }

    public static int executeUpdate(String sql){

        int rowsAffected = 0;

        try(Connection conn = connect();
            Statement stmt = conn.createStatement()) {

                rowsAffected = stmt.executeUpdate(sql);
                System.out.println("Query executed successfully. Rows affected:" + rowsAffected);
        }catch(SQLException e){
            System.out.println("Error executing query: " + e.getMessage());
        }

        return rowsAffected;

    }

   
   
    public static void main(String[] args){
        connect();
        executeUpdate("INSERT INTO Patient (first_name, last_name, gender, phone, email) VALUES ('John', 'Doe', 'Male', '1234567890', 'john.doe@email.com');");

    }
    
}
