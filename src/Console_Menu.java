import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Console_Menu {

    public static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private static final int MAX_DOCTORS = 10;
    private Scanner scan = new Scanner(System.in);
    public void channel_doctor(){
        if (doctors.size() < MAX_DOCTORS) {
            System.out.println("\n-----------Add New Doctor-an----------");

            System.out.println("Enter Name");
            String name = scan.next();

            System.out.println("Enter Surname");
            String surname = scan.next();

            System.out.println("Enter Date of Birth(dd-mm-yyyy)");
            String inputDate = scan.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
            LocalDate dateOfBirth = LocalDate.parse(inputDate, formatter);

            System.out.println("Enter Mobile Number");
            int mobileNumber = scan.nextInt();

            System.out.println("Enter Medical Licence Number");
            int licenseNumber = scan.nextInt();

            System.out.println("Enter Specilization");
            String specialization = scan.next();

            Doctor Doctors = new Doctor();
            Doctors.setName(name);
            Doctors.setSurname(surname);
            Doctors.setDateOfBirth(dateOfBirth);
            Doctors.setMobileNumber(mobileNumber);
            Doctors.setLicenseNumber(licenseNumber);
            Doctors.setSpecialization(specialization);
            doctors.add(Doctors);

        } else {
            System.out.println("Cannot add more doctors. Maximum number of doctors reached.");
        }
    }
    public void remove_channeled_doctor(){

    }
    public void view_channeled_doctor_list(){
        System.out.println("\n--------Print Doctor List--------\n");

        //loop all the objects and print elements
        for (Doctor doc: doctors) {
            System.out.println(
                    "Dr."+ doc.getName()+" "+doc.getSurname()
                    +"\n"+"Date of Birth: "+doc.getDateOfBirth()
                    +"\n"+"Mobile Number: "+doc.getMobileNumber()
                    +"\n"+"License Number: "+doc.getLicenseNumber()
                    +"\n"+"Specialisation: "+doc.getSpecialization());
        }
    }
    public void save_record(){

    }
    public void Gui(){
        System.out.println("This is the GUI");
    }
}
