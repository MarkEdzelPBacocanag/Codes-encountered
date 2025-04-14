class CreateProfile {
    private String uProfile;
    private String characterClass = "UnEmployed";

//Gets the Username
    public String getProfile(){
        return uProfile;
    }

    public String setProfile(String uInput){
        
        uProfile = uInput;
        if(uProfile.isBlank()){

            System.out.println("Invalid input! Please enter a name.");
            uProfile = uInput; // Re-prompt for input

        } else if(uProfile.length() > 15) {

            System.out.println("Name is too long! Please enter a name with 15 characters or less.");
            uProfile = uInput; // Re-prompt for input

        } else if(uProfile.length() < 3) {

            System.out.println("Name is too short! Please enter a name with at least 3 characters.");
            uProfile = uInput; // Re-prompt for input

        }
        return uProfile;
    }

//Gets the character class
    public String getProfileClass(){
        return characterClass;
    }

    public String setProfileClass(int uInput){

        if(uInput < 1 || uInput > 4){
            System.out.println("Invalid Class! \nPlease enter (1-4). Only!");
        }

        switch(uInput){
            case 1 -> {
                characterClass = "Warrior";
                System.out.println("You have chosen the Warrior class!");
            }
            case 2 -> {
                characterClass = "Mage";
                System.out.println("You have chosen the Mage class!");
            }
            case 3 -> {
                characterClass = "Archer";
                System.out.println("You have chosen the Archer class!");
            }
            case 4 -> {
                characterClass = "Rouge";
                System.out.println("You have chosen the Rouge class!");
            }
        }
        return characterClass;
    }
}
