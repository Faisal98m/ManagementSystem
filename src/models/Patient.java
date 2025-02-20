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
    private String first_name;
    private String last_name;
    private LocalDate dob;
    private Integer number;
    private String hospital;


    public String getHospital() {
        return hospital;
    }



    public Patient(String firstName, String lastName, LocalDate dob, int number, String hospital){
        this.firstName = firstName;
        this.last_name = lastName;
        this.dob = dob;
        this.number = number;
        this.hospital = hospital;
    }



    public String getFirst_name() {
        return first_name;
    }
    
    public String getLast_name() {
        return last_name;
    }

    public LocalDate getDob() {
        
        return dob;
    }


    public Integer getNumber() {
        return number;
    }

}