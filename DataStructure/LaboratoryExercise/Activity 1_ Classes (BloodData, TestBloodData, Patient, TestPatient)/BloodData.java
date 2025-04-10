class BloodData
{
   private String bloodType;
   private String rhFactor;
   
   //Set
   public void setRhFactor(String RHFactor)
   {
      rhFactor = RHFactor;
   }

   public void setBloodType(String bType)
   {
      bloodType = bType;
   }
   
   //Get
   public String getBloodType()
   {
      return bloodType;
   }
   
   public String getRhFactor()
   {
      return rhFactor;
   }
   
   //Default value if no user input
   public void defaultValue()
   {
      bloodType = "O";
      rhFactor = "+";
      
      System.out.println("Your blood type: " + bloodType);
      System.out.println("Your RH factor: " + rhFactor);
      
   }
   public void displayBloodInfo()
   {
      System.out.println("Your blood type: " + bloodType);
      System.out.println("Your RH factor: " + rhFactor);
   
   }
   
}