import java.util.*;

public class linkedListOperations {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        //for User inputs 
        Scanner uInput = new Scanner(System.in);
        int count, i = 0, key, option; 

        //saves current iteration count
        int currentIteration = i;

        //Asks for User's max List limits/*  */
        System.out.println("Max list 10 minimum of 5.");
        System.out.print("How many list do you want to add?: ");
        count = Integer.parseInt(uInput.nextLine());

        //This limits on how many lists the User can add
        if(count >= 5 && count <= 10){

        }else{

            System.out.println("5 to 10 lists limit only!");

        }
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

                System.out.println("\nList[" + ++currentIteration + "]: ");
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


        uInput.close();
    }
}