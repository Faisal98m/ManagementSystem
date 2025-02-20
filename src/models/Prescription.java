package models;

import java.time.LocalDate;

public class Prescription {

    /*
     * The prescription tile
     * 
     * User's will be able to add a prescription onto the patients account
     * 
     * The prescription will be a form which will have
     * 
     * Date of prescription
     * Purchase number
     * Prescribed medication -> This is where the medication class can be used
     * 
     * Prescription id number -> First prescription for all pt's start at 1
     * Whenever a new prescription is put on for pt's of any therepy, that number increases
     * 
     * 
     * 
     */

    private int id;
    private LocalDate dateOfPrescriptio;
    private String purchaseNumber;
    private Medication medication;
    


    public Prescription(LocalDate dateOfPrescription, String purchaseNumber, Medication medication){
        this.id = id;
        this.dateOfPrescriptio = dateOfPrescription;
        this.purchaseNumber = purchaseNumber;
        this.medication= medication;
     }

     public int getId() {
        return id;
    }

    public LocalDate getDate_of_prescription() {
        return dateOfPrescriptio;
    }

    public String getpurchaseNumber() {
        return purchaseNumber;
    }

    public Medication getMedication() {
        return medication;
    }
}
