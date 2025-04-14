import java.util.*;

public class TestTextGame {

    public static void main(String[] args) {

        UserValidation userValidator = new UserValidation(); // Create an instance of userValidator
        GameHandler gameHandler = new GameHandler();
        CreateProfile profileCreator = new CreateProfile();

        try (Scanner uInput = new Scanner(System.in)) {
            String uChoice;

            System.out.println("""
                Welcome to the Text Game!
                \nThis is a text-based game adventure, 
                a dungeon game like a RPG game.
                You will be given a series of choices,
                and your decisions will determine 
                the outcome of the game.
                    """);
                Utilities.printDelay("\nMenu\n", 125);
                System.out.println("""
                            [1] Start Game
                            [0] Exit Game
                            """);
        gameHandler.handleGameInput(uInput.nextLine()); // Validate user choice
        
        Utilities.printDelay("\nCreate Profile\n(Username)\nName: ", 75);
        uChoice = uInput.nextLine();
            profileCreator.setProfile(uChoice);

            Utilities.printDelay("Choose your class\n", 75);
            System.out.println("""
                    [1] Warrior
                    [2] Mage
                    [3] Archer
                    [4] Rogue
                    """);
        uChoice = uInput.nextLine();
        profileCreator.setProfileClass(Integer.parseInt(uChoice));

            //Prints Profile
            Utilities.printDelay("\nProfile Summary\n", 75);
            System.out.println("Name: " + profileCreator.getProfile() +
                            "\nClass: " + profileCreator.getProfileClass());
    
    Utilities.printDelay("\nEnter to continue...\n[0] Quit game", 75);
    uChoice = uInput.nextLine();
    userValidator.userChoice(uChoice); // Validate user choice
            
        }
    }//End main
}//End Class
