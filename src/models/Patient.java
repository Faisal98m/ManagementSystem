package models;

import java.time.LocalDate;

public class Patient {


    
    /*The patient tab-
     *A class for handling the patients details
     * 
     *Name / DOB  / NHS Number / Phone Number / Hospital
     *Link pt to hospital
     *Allow edit's and updates
     * 
     *Edit button to edit the details of patients
     *Save button to save inputs
     *Prompt for if a user decided to change to a different tab4 


     Attributes:
     Name / DOB  / NHS Number / Phone Number / Hospital

     Methods:
     -Edit patient details
     -Save Changes
     -Prompt user if they navigate away without saving

     new Patient("john", "doe", 24/12/1993, 0399394004)
     */
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String phoneNumber;
    private Integer hospitalId;
    private String nhsNumber;
    private String gender;
    private Integer addressId;
    private String email;




   

    public Patient(String firstName, String lastName, String gender, String phoneNumber, String email, int hospitalId, int addressId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hospitalId = hospitalId;
        this.addressId = addressId;
    }
    
    public Patient(int id, String firstName, String lastName, String gender, String phoneNumber, int hospitalId, int addressId, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.hospitalId = hospitalId;
        this.addressId = addressId;
        this.email = email;
    }

    public Patient(String firstName, String lastName, LocalDate dob, String phoneNumber, String hospital, String nhsNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.nhsNumber = nhsNumber;
    }



    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public LocalDate getDob() {
        
        return dob;
    }

    public String getNumber() {
        return phoneNumber;
    }
    
    public String getNhsNumber() {
        return nhsNumber;
    }

    public Integer getHospital() {
        return hospitalId;
    }

}