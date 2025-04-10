import java.util.*;

class TestBloodData
{
   public static void main(String[] args)
   {
   //Declaration and Instance
   BloodData bloodD;
   bloodD = new BloodData();
   
   //User Input scanner
   Scanner userInput;
   userInput = new Scanner(System.in);
   
   System.out.println("What is your blood type?: ");
   bloodD.setBloodType(userInput.nextLine());
   
   System.out.println("What is your Rh Factor?: ");
   bloodD.setRhFactor(userInput.nextLine());
   
   System.out.println("Patient: ");
   bloodD.displayBloodInfo();
   
   System.out.println("Default Patient Value: ");
   bloodD.defaultValue();
   }
}