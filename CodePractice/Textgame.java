import java.util.*;

public class Textgame {

    //Ignore SuppressWarning this come from an extension warnings...
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //Initializing the variables
        //for User inputs
        int characterClass;
        String userName;
        Scanner uInput = new Scanner(System.in);

    System.out.println("Welcome to the Text Game!");
    System.out.println("""
        \nThis is a text-based game adventure, 
        a dungeon game like a RPG game.
        You will be given a series of choices,
        and your decisions will determine 
        the outcome of the game.
        """);

        printDelay("""
            \n\tPress Enter to continue...
            \t[0] Quit Game
                    """, 125);
        String userChoice = uInput.nextLine(); // Wait for user to press Enter 

    //Options Functions
    switch(userChoice){

        case "0" -> {
            //Ask the user if they want to quit
            if (userChoice.equals("0")) {

                System.out.println("Are you sure you want to quit? \n(0 = Yes, 1 = No)");
                int quitInput = uInput.nextInt();
            switch(quitInput){

                case 0 -> {
                    printDelay("Thanks for playing! <3", 200);
                    System.exit(0);

                }
                default -> {
                    printDelay("Continue...\n", 125);
                }

            }
        } else {

            System.out.println("Invalid input! Please enter a number between 0 and 1.");

            }
        }
    }
    System.out.println("Create Profile");
    System.out.print("Name:");
    userName = uInput.nextLine();
    do{
    //Class Options
    System.out.print("""
                    Classes: 
                    [1] Warrior - dex, str based character
                    [2] Mage - int, based character
                    [3] Archer - str, agi based character
                    [4] Rogue - agi, dex based character
                    """);
    System.out.print("\nChoose your class: ");
    characterClass = uInput.nextInt();

    uInput.nextLine(); // Clear the buffer
    if(characterClass < 1 || characterClass > 4) {
        
        System.out.println("Invalid class selection! (1-4).");
        uInput.nextLine();

    }
}while(characterClass < 1 || characterClass > 4);
    printDelay("Press Enter to continue...", 125);
    uInput.nextLine();
    //Profile

        System.out.printf("""
            Profile Summary
            Username: """ + userName + 
            "\nClass: " +  cClass(characterClass) + 
            "\n");

    uInput.close(); // Close the scanner to prevent resource leaks
    }

    //Delays the next Print of text
    static void printDelay(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay); // Delay in milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore the interrupted status
            }
        }
    }

    //Class
    static String cClass(int charClass){
        
        StringBuilder string = new StringBuilder();
        switch (charClass) {
            case 1 -> string.append("Warrior");
            case 2 -> string.append("Mage");
            case 3 -> string.append("Archer");
            case 4 -> string.append("Rogue");
        }
        return string.toString();
    }       
}