import java.util.*;

public class WestminsterSkinConsultationManager implements SkinConsultationManager{
  private Scanner scan = new Scanner(System.in);

  private List<Doctor> doctors = new ArrayList<>();

  @Override
    public void menu(){
      while(true){
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
              break;
          }

      }
  }
    private void addNewDoctor() {

    }
    private void deleteDoctor() {

    }
    private void printList() {

    }
    private void saveFile() {

    }

    private void launchGUI() {

    }








}