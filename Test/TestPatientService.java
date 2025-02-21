package Test;

import services.PatientService;

public class TestPatientService {
    public static void main(String[] args) {
        PatientService patientService = new PatientService();

        // Add a new patient
        int patientId = patientService.addPatient("john", "jones", "Male", "098843343", 1, 1, "johnbones@gmail.com");
        System.out.println(patientService.getPatientByID(patientId));
        

    }
}
