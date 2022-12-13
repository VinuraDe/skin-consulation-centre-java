import java.util.*;
public class WestminsterSkinConsultationManager {
    //maintains the list of the doctors and provides all the methods for the system manager.
    //display in the console a menu

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        //ADD a new Doctor
        System.out.println("A: Add a doctor to the system");

        //Delete a doctor
        System.out.println("D: Delete customer from a Coach");

        //Print the list of the doctors
        System.out.println("V: View all the 'Doctors'");

        //Save in a file-read back all the information
        System.out.println("S: Store program data into file");
        System.out.println("L: Load program data from file");
    }

}
