
class Learner {
   private int id;
   private String firstName;
   private String lastName;
   private String program;
   private int year;

   public Learner(int id, String fName, String lName, String program, int year) {
      this.id = id;
      firstName = fName;
      lastName = lName;
      this.program = program;
      this.year = year;
   }

   public int getId() {
      return id;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getProgram() {
      return program;
   }

   public int getYear() {
      return year;
   }

   @Override
   public String toString() {
      return String.format("%-10d | %-14s | %-14s | %-14s | %-10d",
             id, firstName, lastName, program, year);
   }
}