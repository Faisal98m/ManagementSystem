package models;

public class Hospital {
    

    /*
     * Handling of hospital establisments
     * 
     * This will be used in the patients account class
     * The user will use a dropdown to select the hospital
     * 
     * This class will store the hospitals in the database.
     * It will fetch the hospital name from the db
     * 
     * This will be it's own entity. 
     * It will have the hospital name, address and email address -> All of which can be fetched
     * 
     * Attributes
     * -name
     * -address
     * -email
     * 
     * Methods:
     * -Fetch Hospital details
     * -Retrieve hospital list for dropdown
     * 
     */

    
    private String name;
    private int id;

    private Address address;
    
    private String email;

    public Hospital (){}

    public Hospital (int id,String name, Address address, String email){
        this.name = name;
        this.address = address;
        this.email = email;
        this.id =id;
    }

    
    public int getId(){
        return id;
    }


    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }


    private void setAddress(Address address){
        this.address = address;
    }

    private void setEmail(String email){
        this.email = email;
    }
}

