package database;
/*
 * 
 * Central point of communication between our project and the database
 * Send data to the database (insert, update, delete)
 * Fetch data (read operations)
 * maintain database integrity
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/*Establis a connection with mydatabase.db
 * allow sql execution (CRUD)
 * allow queries (fethching from tables)/
 * close the connection properly when done.
 * 
 */

public class DatabaseConnector {

    private static final String URL = "C:\\Users\\faisa\\OneDrive\\Desktop\\Patient Management System\\Resources\\mydatabase.db";


    public static Connection connect(){
        Connection conn = null;

        try{
            
            conn = DriverManager.getConnection(URL);

            System.out.println("connection to sql has been established");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        
        }

        System.out.println("Connected to database at: " + URL);

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

    public static ResultSet executeQuery(String sql){

        ResultSet resultSet = null;

        try(Connection conn = connect();
        Statement stmt = conn.createStatement()){
            resultSet = stmt.executeQuery(sql);
            System.out.println("Query executed succesfully" );
        }catch(SQLException ex){
            System.out.println("error executing query: " + ex.getMessage());
        }

        if(resultSet == null){
            System.out.println("Null, check if query correct");
        }

        return resultSet;
    }


    public static void closeConnection(Connection conn){

        try{
            if(conn!= null){
                conn.close();
                System.out.println("Connection is closed.");
            }
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

   
   
    public static void main(String[] args){
        connect();
        ResultSet rs = executeQuery("SELECT * FROM Patient;");

        try{
            boolean  hasresults = false;
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String gender = rs.getString("gender");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
    
                System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName + 
                    ", Gender: " + gender + ", Phone: " + phone + ", Email: " + email);
            }
            if(!hasresults){
                System.out.println("nothing ");
            }
        }catch(SQLException e){

            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
