package models;

import java.time.LocalDate;

public class Medication {

    /*
     * Allows  for storage of our medication
     * 
     * Thinking backwords, this class will be used in other sections like patient details
     * Can be used in prescription tab to add correct medication for user
     * Specific to the therapy. 
     * If the user is in Ibuprofen patient, it can only add ibuprofen
     * Same with the rest
     * We can also add a strength for the medication
     * 
     * Attributes:
     * Name /  Strength
     * 
     * 
     * Methods:
     * Getters / Setters
     * Retrieve medication list for prescription tab
     */

    private int id;
    private String name;
    private Integer strength;
    private LocalDate date;
  
    
    public Medication(int id,String name, int strength, LocalDate date){
        this.name = name;
        this.strength = strength;
        this.date = date;
        this.id = id;
    }


    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getStrength() {
        return strength;
    }

    public LocalDate getDate() {
        return date;
    }
}
