import java.util.Scanner;
class UserValidation {
    //validates users choices if to continue or quit the game
    @SuppressWarnings("ConvertToTryWithResources")
    public String userChoice(String userInput){
        Scanner newInput = new Scanner(System.in);

        if(userInput.equals("0")) {

            //Ask the user if they want to quit
            System.out.println("Are you sure you want to quit? \n(0 = Yes, 1 = No)");
            int quitInput = newInput.nextInt();
            switch(quitInput){
                case 0 -> {
                    Utilities.printDelay("Thank you for playing! <3", 50);
                    System.exit(0);
                }
                default -> {
                    System.out.println("Continue...\n");
                }
            }
        } else if(!userInput.isEmpty()){

            System.out.println("Invalid input! Please press Enter to continue.");
            userInput = newInput.nextLine(); // Wait for user to press Enter

        }else if(userInput.isEmpty()){

            Utilities.printDelay("Continue...", 50);

        }

        return userInput;
    }
}
