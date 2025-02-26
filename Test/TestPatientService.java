package Test;

import models.Patient;
import services.PatientService;

public class TestPatientService {
    public static void main(String[] args) {
        PatientService patientService = new PatientService();

        // Add a new patient
        Patient ibrahimovic = new Patient("Zlatan", "brahim", "Female", "2223", "sam.brap@gmai.com", 2, 14);
        int brahim = patientService.addPatient(ibrahimovic);
        System.out.println(patientService.getPatientByID(brahim));
        System.out.println(ibrahimovic.toString());
        
        

    }
}
