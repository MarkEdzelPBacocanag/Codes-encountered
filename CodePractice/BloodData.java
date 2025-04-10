public class BloodData{
        private String bloodType;
        private String rhFactor;
        
        public BloodData() {
           bloodType = "O";
           rhFactor = "+";
         }
         
         public BloodData(String bloodType, String rhFactor) {
           this.bloodType = bloodType;
           this.rhFactor = rhFactor;
         }
         
         public String getBloodType() {
         return bloodType;
         }
         
         public void setBloodType(String bloodType) {
           this.bloodType = bloodType;
         }
         
         public String getRhFactor() {
           return rhFactor;
         }
         
         public void setRhFactor(String rhFactor) {
           this.rhFactor = rhFactor;
     
         }
         
         public void defaultPatient() {
           this.bloodType = "A";
           this.rhFactor = "+";
         }
         
         public void displayBloodInfo() {
           System.out.println("Your Blood type is:" + bloodType);
           System.out.println ("Your Rh factor is: " + rhFactor);
           
          }
       }
