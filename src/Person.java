import java.util.Date;
public class Person {
    //need to use encapsulation principle
    //holding information about the name, surname, date of birth and mobile number
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String mobileNumber;

    //constructor

    public Person(String name, String surname, Date dateOfBirth, String mobileNumber) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString(){
        return "name = " + name + ", sName = " + surname + ", dob = " + dateOfBirth + ", mobileNum = " + mobileNumber;
    }
}
