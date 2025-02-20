package models;

public class Address {

/*
 * Represents a patient's address. Stores and manges address details for pt's
 * 
 * Responsibility:
 * -Store address information
 * -Retrieve and update address
 * -Format address for displau
 * 
 * Not responsible for:
 * -Searching for a patient by address
 * -Verifying address validity
 * 
 * 
 * Attributes:
 * houseNumber / streetname / city / postcode
 * 
 * Methods:
 * -> Getters and Setters
 */

    private String streetName;
    private int houseNumber;
    private String post_code;
    private String city;


    public Address(String streetName, int houseNumber, String postcode, String city ){
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.post_code = postcode;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public int gethouseNumber() {
        return houseNumber;
    }
    public String getPostcode() {
        return post_code;
    }
    
    public String getCity() {
        return city;
    }


    public void setStreetName(String streetName) {
         this.streetName = streetName; 
        }

    public void setHouseNumber(int houseNumber) {
         this.houseNumber = houseNumber; 
        }

    public void setPostcode(String postcode) {
         this.postcode = postcode;
         }
         
    public void setCity(String city) { 
        this.city = city; 
    }




    




    
}
