import java.time.LocalDate;

public class Patient extends Person {
    private int patientId;
    private String disease;
    private boolean isChecked;
    public Patient(int patientId, String disease, boolean isChecked, String name, String surname, LocalDate dateOfBirth, int mobileNumber) {
        super(name, surname, dateOfBirth, mobileNumber);
        this.patientId=patientId;
        this.disease=disease;
        this.isChecked=isChecked;
    }

    //should add a patient unique id as instance variables
    // Field for the patient's unique ID


    // Getter and setter methods for the patient ID field
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease() {
        this.disease=disease;
    }

    public boolean  getisChecked(){
        return isChecked;
    }

    public void setisChecked(){
        this.isChecked=isChecked;
    }

//    @Override
//    public String toString(){
//        return "Patient{" + super.toString() + "patientId=" + patientId + ", sickness=" + disease + ", insured=" + isChecked + '}';
//    }
}

