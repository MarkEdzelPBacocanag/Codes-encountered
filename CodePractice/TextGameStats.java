class TextGameStats{

    //level
    static int level(int exp){

        int leveledUp = 1;
        leveledUp += exp / 100;

        return leveledUp;
    }

    //health
    static double health(int plusStats){
        double calculatedHealth = 100;
        if(plusStats == 1){
        calculatedHealth +=  5;
        }
        return calculatedHealth;
    }

    //stats
    static double classStats(int characterClass, String classType){
        double baseStats = 10;
        double classStats = baseStats;

        switch(characterClass){
            case 1 ->{

                if(classType.equalsIgnoreCase("Str")){
                    baseStats += 2; // Str
                }
            
            } 
            case 2 ->{

                if(classType.equalsIgnoreCase("Int")){
                    baseStats += 2; // Int
                }

            } 
            case 3 ->{

                if(classType.equalsIgnoreCase("Agi")){
                    baseStats += 2; // Agi
                }

            } 
            case 4 -> {

                if(classType.equalsIgnoreCase("Dex")){
                    baseStats += 1.5; // Dex
                }

            }
            default -> {System.out.println("Invalid class selection! (1-4).");
            return -4;}
        }
        return classStats;
    }

    //Display
    static void settings(int option, int characterClass) {
        switch (option) {
            case 1 -> { 
                System.out.println("Stats\nHealth: " + health(1) + 
                    "\nStr: " + classStats(characterClass, "Str") + 
                    "\nInt: " + classStats(characterClass, "Int") + 
                    "\nDex: " + classStats(characterClass, "Dex") + 
                    "\nAgi: " + classStats(characterClass, "Agi"));
            }
            case 2 -> {
                System.out.println("Level: " + level(150)); // Example: Fetch level based on experience
            }
            default -> System.out.println("Invalid option! Please enter a number between 1 and 4.");
        }
    }


/*===============================Class/Effects========================================= */
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
}//End of Class