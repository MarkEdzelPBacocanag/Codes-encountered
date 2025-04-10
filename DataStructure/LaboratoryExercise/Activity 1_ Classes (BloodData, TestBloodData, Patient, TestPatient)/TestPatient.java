import java.util.*;

class TestPatient
{
   public static void main(String[] args)
   {
      Patient patient;
      patient = new Patient();
      BloodData bloodData;
      bloodData = new BloodData();
      Scanner userInput;
      userInput = new Scanner(System.in);
       
      System.out.println("Patient 1:\n" + 
                           "ID number: " +  
                             patient.getIdNumber() + 
                              "\nAge: " + 
                                 patient.getAge());
      
      System.out.println(" ");
      System.out.println("Patient 2: ");
      System.out.print("ID number: ");
      patient.setIdNumber(userInput.nextInt());
      System.out.print("Age: ");
      patient.setAge(userInput.nextInt());
      bloodData.defaultValue();
   }
}