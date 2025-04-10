import java.util.*;

//linkedLists is a static way in calling them from another class
//Instead of creating a new object
//Called them in a static way
//ex: "linkedLists".insertAtBeginning
//linkedLists is the name of the class

public class linkedListOperations {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        //for User inputs 
        Scanner uInput = new Scanner(System.in);
        int count = 0, i = 0, key, option; 

        //saves current iteration count
        int currentIteration = i;

        //Asks for User's max List limits
        //This limits on how many lists the User can add
        System.out.println("Max list 10 minimum of 5.");
        System.out.print("How many lists you want to add?: ");
        do{     
            count = Integer.parseInt(uInput.nextLine());
            if (count < 5 || count > 10) {
                System.out.println("Invalid input! Please enter a number between 5 and 10.");
            }

        }while(count < 5 || count > 10);

        do{
                //User's Option in the program
                System.out.println("""
                                   
                                   [1] Insert an Element(Beginning)
                                   [2] Delete an Element(Beginning)
                                   [3] Display All Elements
                                   [4] Search an Element
                                   [5] Delete an Element
                                   [0] Terminate Program""");
        System.out.print("Choose Option: ");
        option = uInput.nextInt();

        //Options Functions
        switch(option){
            case 0 -> {

                System.exit(0);

            }
            case 1 -> {

            for(i = currentIteration; i < count;){

                System.out.print("\nList[" + ++currentIteration + "]: ");
                //Calling insertAtBeginning in the linked list
                linkedLists.insertAtBeginning(uInput.nextInt());
                break;

            }

            }
            case 2 -> {

                linkedLists.deleteAtBeginning();

            }
            case 3 -> {

                System.out.println("\nLinked List: " + linkedLists.displayLists());

            }
            case 4 -> {

                System.out.println("\nWhat Element you want to Search?: ");
                key = uInput.nextInt();
                linkedLists.searchList(key);

            }
            case 5 -> {

                System.out.println("\nWhat Element you want to Delete?: ");
                key = uInput.nextInt();
                linkedLists.deleteAtNode(key);

            }
            default -> System.out.println("\nInvalid Option!");
        }

    }while(option != 0);
        //close the scanner
        uInput.close();
    }
}
