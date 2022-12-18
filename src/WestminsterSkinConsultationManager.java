import javax.print.Doc;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    private Scanner scan = new Scanner(System.in);

    private static final int MAX_DOCTORS = 10;
//    public static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
//    static Doctor[] doctors = new Doctor[MAX_DOCTORS];
    public static ArrayList <Doctor> doctors = new ArrayList<Doctor>();


    @Override
    public void menu() {
        while (true) {
            System.out.println("-----------------Menu-----------------\n");
            System.out.println("1.Add a new doctor");
            System.out.println("2.Delete a doctor");
            System.out.println("3.Print the list of the doctors");
            System.out.println("4.Save in a file");
            System.out.println("5.Launch GUI");
            System.out.println("0.Quit");
            System.out.println("--------------------------------------\n");
            System.out.print("Choice: ");

            String opinion = scan.next();

            if (opinion.equals("1")) {
                addNewDoctor();
            } else if (opinion.equals("2")) {
                deleteDoctor();
            } else if (opinion.equals("3")) {
                printList();
            } else if (opinion.equals("4")) {
                saveFile();
            } else if (opinion.equals("5")) {
                launchGUI();
            } else {
                System.out.println("Invalid input. Please try again.");
                break;
            }

        }
    }


    private void addNewDoctor() {
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


//            doctors.add(new Doctor(licenseNumber, specialization, name, surname, dateOfBirth, mobileNumber));
        } else {
            System.out.println("Cannot add more doctors. Maximum number of doctors reached.");
        }
    }

    private void deleteDoctor() {
        if (!doctors.isEmpty()){
            System.out.println("\n-----------Delete Doctor-----------");
            System.out.println("Enter First Name of Doctor to be deleted");
            String name = scan.next();

            for (Doctor doctor : doctors) {//for each loop
                if (name.equalsIgnoreCase(doctor.getName())) {
                    doctors.remove(doctor);
                }
            }
        }
        else{
            System.out.println("No Doctors entered yet.");
        }
    }

    private void printList() {
        System.out.println("\n--------Print Doctor List--------");

//        Doctor doc = new Doctor();
        for (Doctor doc: doctors) {
            System.out.println(doc.getName());
        }

    }

    private void saveFile() {
        System.out.println("\n-----------Save to File-----------");
        try {
            if (!doctors.isEmpty()) {
                System.out.println("File created");
                FileWriter myWriter = new FileWriter("DoctorFile.txt");
                myWriter.write(doctors.toString());
                myWriter.close();
            } else {
                System.out.println("No Doctors entered yet.");
            }
        } catch (IOException e) {
            System.out.println("Error creating text file " + e);
        }
    }

    private void launchGUI() {

    }
}