import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
   private static List<Learner> learners = new ArrayList<>();

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int option;
   
      while (true) {
         displayMenu();
         option = input.nextInt();
         input.nextLine(); 
      
         if (option == 0) {
            System.out.println("Terminating program...");
            break;
         }
      
         switch (option) {
            case 1:
               registerLearner(input);
               break;
            case 2:
               showAllLearners(false);
               break;
            case 3:
               showAllLearners(true);
               break;
            default:
               System.out.println("Invalid option. Please try again.");
         }
      }
   
      input.close();
   }
//Options
   private static void displayMenu() {
      System.out.println("\nMenu:");
      System.out.println("1. Register New Learner");
      System.out.println("2. Show All Learners");
      System.out.println("3. Show All Learners in Reverse");
      System.out.println("0. Exit");
      System.out.print("Choose an option: ");
   }
//for registering new learners
   private static void registerLearner(Scanner input) {
      System.out.print("Enter ID: ");
      int id = input.nextInt();
      input.nextLine(); 
   
      System.out.print("Enter First Name: ");
      String firstName = input.nextLine();
   
      System.out.print("Enter Last Name: ");
      String lastName = input.nextLine();
   
      System.out.print("Enter Program: ");
      String program = input.nextLine();
   
      System.out.print("Enter Year: ");
      int year = input.nextInt();
      input.nextLine();
   
      learners.add(new Learner(id, firstName, lastName, program, year));
      System.out.println("Learner registered successfully.");
   }
//Checks if the learners is empty and also displays reverse
   private static void showAllLearners(boolean reverse) {
      if (learners.isEmpty()) {
         System.out.println("No learners to display.");
         return;
      }
   
      printHeader();
      if (reverse) {
         for (int i = learners.size() - 1; i >= 0; i--) {
            System.out.println(learners.get(i));
         }
      } else {
         for (Learner learner : learners) {
            System.out.println(learner);
         }
      }
   }
//Prints Headers
   private static void printHeader() {
      System.out.println("ID Number  | First Name     | Last Name      | Program        | Year Level");
      System.out.println("-----------+----------------+----------------+----------------+------------");
   }
}
