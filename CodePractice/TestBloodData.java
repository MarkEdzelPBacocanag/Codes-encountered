import java.util.*;
public class TestBloodData{

    public static void main(String[] args) {
        BloodData bloodData;
        String bloodType;
        String rhFactor;
        try (Scanner input = new Scanner(System.in)) {
            bloodData = new BloodData();
            System.out.print("Enter Blood Type: ");
            bloodType = input.nextLine();
            System.out.print("Enter Rh Factor: ");
            rhFactor = input.nextLine();
        }
        bloodData.setBloodType(bloodType);
        bloodData.setRhFactor(rhFactor);

        
        bloodData.displayBloodInfo();
    }
}