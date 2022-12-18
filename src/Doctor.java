import java.time.LocalDate;

public class Doctor extends Person{
    //should add the medical licence number and the specialisation
    //specialisations - > cosmetic dermatology, medical dermatology, paediatric,dermatology
    private int licenseNumber;
    private String specialization;
    public Doctor(int licenseNumber, String specialization, String name, String surname, LocalDate dateOfBirth, int mobileNumber) {
        super(name, surname, dateOfBirth, mobileNumber);
        this.licenseNumber=licenseNumber;
        this.specialization=specialization;
    }

    public Doctor() {
        super();
    }


    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

//    @Override
//    public String toString(){
//        return "\nDoctor-\" + super.toString() + \"Medical_Lisence = \" + licenseNumber + \", specialization = \" + specialization + \n";
//    }

}
