public class GameHandler {
    public int handleGameInput(String uInput){
        UserValidation validate = new UserValidation();// User validation

        int input = Integer.parseInt(uInput); // Handle game input
        switch(input){
            case 1 -> {
                Utilities.printDelay("Starting Game...\n\n", 75);
            }
            case 0 -> {

                validate.userChoice(uInput);

            }
        }
        return input;
    }
}
