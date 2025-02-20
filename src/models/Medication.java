package models;


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

    private String name;
    private Integer strength;
    private String date;
  
    
    public Medication(String name, int strength, String date){
        this.name = name;
        this.strength = strength;
        this.date = date;
    }



    public String getName() {
        return name;
    }

    public Integer getStrength() {
        return strength;
    }

    public String getDate() {
        return date;
    }
}
