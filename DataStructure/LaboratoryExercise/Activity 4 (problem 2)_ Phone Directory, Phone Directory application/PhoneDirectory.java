import java.util.*;

public class PhoneDirectory
{
   public static void main(String[] args) {
        Scanner userI = new Scanner(System.in);
        List<PhoneDirectoryEntry> directory = new ArrayList<>(); 

        System.out.println("Enter number of entries: ");
        int initialEntries = Integer.parseInt(userI.nextLine()); 
        
        for (int i = 0; i < initialEntries; i++) {
         System.out.print("Enter name for entry " + (i+1) + ": \n\t");
         String name = userI.nextLine();
         System.out.print("\nEnter phone number for " + name +": \n\t");
         String phoneNumber = userI.nextLine();
         directory.add(new PhoneDirectoryEntry(name, phoneNumber));
        }
         
        while (true) {
            System.out.print("Enter a name to search (or 'quit' to exit): ");
            String inputName = userI.nextLine();

            if (inputName.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the program.");
                break;
            }

            boolean found = false;
            for (PhoneDirectoryEntry entry : directory) {
                if (entry.getFirstName().equalsIgnoreCase(inputName)) {
                    System.out.println("Phone number for " + inputName + ": " + entry.getPhoneNumber());
                    found = true;
                    break;
                }            
            }
            if (!found) {
                if (initialEntries >= 30) {
                    System.out.println("Directory is full. Cannot add new entries.");
                    break;
                }
                System.out.print("Name not found. Enter phone number for " + inputName + ": ");
                String phoneNumber = userI.nextLine();
                directory.add(new PhoneDirectoryEntry(inputName, phoneNumber));
                System.out.println("Added " + inputName + " to the directory.");
            }
        }

        System.out.println("\nFinal Directory:");
        for (PhoneDirectoryEntry entry : directory) {
            System.out.println(entry);
        }

        userI.close();
    }

}