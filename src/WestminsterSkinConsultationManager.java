import javax.print.Doc;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    private Scanner scan = new Scanner(System.in);
//    public static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
//    static Doctor[] doctors = new Doctor[MAX_DOCTORS];
    public static ArrayList <Doctor> doctors = new ArrayList<Doctor>();
    public static Console_Menu console_menu = new Console_Menu();

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
        console_menu.channel_doctor();
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
        console_menu.view_channeled_doctor_list();
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
        console_menu.Gui();
    }
}