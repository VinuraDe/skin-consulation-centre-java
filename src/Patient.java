import java.util.Date;

public class Patient extends Person {
    public Patient(String name, String surname, Date dateOfBirth, String mobileNumber) {
        super(name, surname, dateOfBirth, mobileNumber);
    }

    //should add a patient unique id as instance variables
    // Field for the patient's unique ID
    private String patientId;

    // Getter and setter methods for the patient ID field
    public String getPatientId() {
        return this.patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

}
