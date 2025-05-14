public class Person 
{
    String firstName;
    String lastName;

    public Person(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }

    public String getName()
    {
        return firstName +" "+ lastName;
    }
}


