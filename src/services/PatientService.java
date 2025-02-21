package services;

import java.sql.ResultSet;
import java.time.LocalDate;

import javax.xml.crypto.Data;

import database.DatabaseConnector;
import models.Patient;

/*
 * 
 * This part of our project will act as a seive.
 * By seive I mean that this layer is where the information coming in from the user 
 * gets checked. 
 * It is where all the business logic happens 
 * Stops the user from directly interaction with the database
 * Only allows information to be added to the database, once it meets our requirements
 * 
 * 
 * We need to see this from a business perspective.
 * When the user is typing in information and saving it, what requirements do we need from user.
 * Is the information inputted, correct? 
 * Correct type, correct length, correct 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class PatientService {


    public Integer addPatient(String firstName, String lastName, String gender, String phoneNumber, int hospitalId, int addressId, String email){

        String sql =  "INSERT INTO Patient (first_name, last_name, gender, phone, email, hospital_id, address_id) " +
        "VALUES ('" + firstName + "', '" + lastName + "', '" + gender + "', '" + phoneNumber + "', '" + email + "', " + hospitalId + ", " + addressId + ")";
    
        DatabaseConnector.executeUpdate(sql);
        System.out.println("Patient added: " + firstName + " " + lastName);

        ResultSet rs = DatabaseConnector.executeQuery("SELECT last_insert_rowid()");

        try{
            if(rs.next()){
                return rs.getInt(1);
            }
        }catch(Exception e){
            System.out.println("Error fetching id: " + e.getMessage());
        }

        return -1;
    
    }
    
    public Patient getPatientByID(int id) {
        String sql = "SELECT * FROM Patient WHERE id = " + id;
        ResultSet rs = DatabaseConnector.executeQuery(sql);
    
        try {
            if (rs.next()) {
                return new Patient(
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("gender"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getInt("hospital_id"),
                    rs.getInt("address_id")
                );
            } else {
                System.out.println("No patient found with ID: " + id);
                return null;
            }
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return null;
        }
    }
    
    public void updatePatient(int id,String firstName, String lastName, String gender, String phoneNumber, Integer hospitalId, Integer addressId, String email){

        StringBuilder sql = new StringBuilder("UPDATE Patient SET ");

        if(firstName != null) sql.append("first_name= '").append(firstName).append("', ");
        if(lastName != null) sql.append("last_name= '").append(lastName).append("', ");
        if(gender != null) sql.append("gender= '").append(gender).append("', ");
        if(phoneNumber != null) sql.append("phone= '").append(phoneNumber).append("', ");
        if(email != null) sql.append("email= '").append(email).append("', ");
        if(hospitalId != null) sql.append("hospital_id = '").append(hospitalId).append(", ");
        if(addressId != null) sql.append("address_id = '").append(addressId).append(", ");

        sql.setLength(sql.length() -2);
        sql.append(" WHERE id =").append(id);

        DatabaseConnector.executeUpdate(sql.toString());
        System.out.println("Patient update: " + id ) ;


    
    }
    
    public void deletePatient(int id){
        String sql = "DELETE FROM Patient where id =" +id;

        DatabaseConnector.executeUpdate(sql);
        System.out.println("Patient deleted: " + id);
    }
    
}

