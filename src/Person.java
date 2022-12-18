import java.time.LocalDate;

public class Person {
    //need to use encapsulation principle
    //holding information about the name, surname, date of birth and mobile number
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int mobileNumber;

    //constructor

    public Person(String name, String surname, LocalDate dateOfBirth, int mobileNumber) {
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    @Override
    public String toString(){
        return "name = " + name + ", sName = " + surname + ", dob = " + dateOfBirth + ", mobileNum = " + mobileNumber;
    }
}
