import java.util.Date;

public class Doctor extends Person{
    public Doctor(String name, String surname, Date dateOfBirth, String mobileNumber) {
        super(name, surname, dateOfBirth, mobileNumber);
    }
    //should add the medical licence number and the specialisation
    //specialisations - > cosmetic dermatology, medical dermatology, paediatric,dermatology
    private String licenseNumber;
    private String specialization;

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
