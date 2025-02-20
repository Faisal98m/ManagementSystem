package models;

import java.security.Timestamp;
import java.time.LocalDate;

public class ContactNote {
    
    /*
     * This class will handle notes for each patient
     * It will be one of the tabs which the user can edit on the patients account
     * Ffeatures of this class is adding notes
     * These notes will then be marked with
     *  - User who made the note
     *  - Timestamp
     *  - Date
     * 
     * Responsibilities:
     * -Add notes 
     * -Notes cannot be deleted once added
     * -View stamps of user activity
     * 
     * Rules:
     * -Notes cannot be deleted
     * -Notes are timestamped and linked to user
     * -View logs of activity
     * 
     * 
     * 
     * 
     * Attributes-
     * -noteText
     * -createdBy(user)
     * -timeStamp
     * -date
     * 
     * Methods:
     * -Add notes 
     * -> prompts user to type note
     * -> save or cancel
     * -> save, adds it to our notes
     * -> We can then view the note on our screen with timestamps of user activity
     * 
     */

    private String note_text;
    private User createdByUser;
    private Timestamp timestamp;
    private LocalDate date;

 

    public ContactNote(String noteText, User createdBy, LocalDate date){
        this.note_text = noteText;
        this.date = date;
        this.createdByUser = createdBy;
     }


     public String getNote_text() {
        return note_text;
    }

    public User getCreated_by_user() {
        return createdByUser;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public LocalDate getDate() {
        return date;
    }
    
}
