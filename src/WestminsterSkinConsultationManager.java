import java.util.*;
public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    //maintains the list of the doctors and provides all the methods for the system manager.
    //display in the console a menu

    // Fields for the list of doctors and consultations
    private List<Doctor> doctors;
    private List<Consultation> consultations;

    // Field for reading input from the user
    private Scanner scanner;

    // Constructor that initializes the list of doctors and consultations
    public WestminsterSkinConsultationManager() {
        this.doctors = new ArrayList<Doctor>();
        this.consultations = new ArrayList<Consultation>();

        this.scanner = new Scanner(System.in);
    }

    // Method for adding a doctor to the list of doctors
    @Override
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    // Method for removing a doctor from the list of doctors
    @Override
    public void removeDoctor(Doctor doctor) {
        this.doctors.remove(doctor);
    }

    // Method for adding a consultation to the list of consultations
    @Override
    public void addConsultation(Consultation consultation) {
        this.consultations.add(consultation);
    }

    // Method for canceling a consultation from the list of consultations
    @Override
    public void cancelConsultation(Consultation consultation) {
        this.consultations.remove(consultation);
    }

    // Method for printing the list of consultations
    @Override
    public void printConsultations() {
        for (Consultation consultation : this.consultations) {
            System.out.println(consultation);
        }
    }


    // Method for displaying the menu of management actions and prompting the user to select an action
    public void displayMenu() {
        while (true) {
            System.out.println("Select a management action:");
            System.out.println("1. Add a new doctor");
            System.out.println("2. Remove a doctor");
            System.out.println("3. Add a consultation");
            System.out.println("4. Cancel a consultation");
            System.out.println("5. Print the list of consultations");
            System.out.println("6. Exit");
            System.out.print("Enter the number of the action you want to perform: ");
            int action = this.scanner.nextInt();
            if (action == 1) {
                this.addDoctor();
            } else if (action == 2) {
                // Prompt the user for the doctor to remove and call the removeDoctor() method
            } else if (action == 3) {
                // Prompt the user for the consultation to add and call the addConsultation() method
            } else if (action == 4) {
                // Prompt the user for the consultation to cancel and call the cancelConsultation() method
            } else if (action == 5) {
                this.printConsultations();
            } else if (action == 6) {
                break;
            } else {
                System.out.println("Invalid action. Please try again.");
            }
        }
    }

    private void addDoctor() {

    }


}

