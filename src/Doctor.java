import java.util.Date;

public class Doctor extends Person{
    //should add the medical licence number and the specialisation
    //specialisations - > cosmetic dermatology, medical dermatology, paediatric,dermatology
    private String licenseNumber;
    private String specialization;
    public Doctor(String name, String surname, Date dateOfBirth, String mobileNumber, String licenseNumber , String specialization ) {
        super(name, surname, dateOfBirth, mobileNumber);
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString(){
        return "\nDoctor-\" + super.toString() + \"Medical_Lisence = \" + licenseNumber + \", specialization = \" + specialization + \n";
    }

}
