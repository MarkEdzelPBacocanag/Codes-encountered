import java.util.Scanner;

public class AddressBook {
    public static Scanner scan = new Scanner(System.in);
    static class Node
    {
        ExtPerson person;
        Node next;
        Node(String fName,String lName, String phoneNumber, String streetAdd, String cityAdd, String stateAdd, String zipCodeAdd, int month, int day, int year, String category)
        {
        person = new ExtPerson(fName, lName, phoneNumber, streetAdd, cityAdd, stateAdd, zipCodeAdd, month, day, year, category);
            next = null;
        }
    }

    static Node head;
    //Add person at the end
    static void insertAtEnd()
    {
        if(head == null)
        {
            scan.nextLine(); // Consume the newline character left by nextInt()
            System.out.println("Enter last name: ");
            String lName = scan.nextLine();
            System.out.println("Enter first name: ");
            String fName = scan.nextLine();
            System.out.println("Enter phone number: ");
            String phoneNumber = scan.nextLine(); // Use nextLine() and parse to avoid newline issues
            System.out.println("Enter Street Address: ");
            String streetAdd = scan.nextLine();
            System.out.println("Enter City Address: ");
            String cityAdd = scan.nextLine();
            System.out.println("Enter State Address: ");
            String stateAdd = scan.nextLine();
            System.out.println("Enter Zip Code Address: ");
            String zipCodeAdd = scan.nextLine(); 
            System.out.println("Enter Month: ");
            int month = Integer.parseInt(scan.nextLine()); // Use nextLine() and parse to avoid newline issues
            System.out.println("Enter Day: ");
            int day = Integer.parseInt(scan.nextLine()); // Use nextLine() and parse to avoid newline issues
            System.out.println("Enter Year: ");
            int year = Integer.parseInt(scan.nextLine()); // Use nextLine() and parse to avoid newline issues
            System.out.println("Enter Category: ");
            String category = scan.nextLine();
            Node link = new Node(fName, lName, phoneNumber, streetAdd, cityAdd, stateAdd, zipCodeAdd, month, day, year, category);
            head = link;

            System.out.println("Entry added successfully!");
            link.person.display();
        }else
            {
                Node temp = head;
                while(temp.next != null)
                {
                scan.nextLine(); // Consume the newline character left by nextInt()
                System.out.println("Enter last name: ");
                String lName = scan.nextLine();
                System.out.println("Enter first name: ");
                String fName = scan.nextLine();
                System.out.println("Enter phone number: ");
                String phoneNumber = scan.nextLine(); // Use nextLine() and parse to avoid newline issues
                System.out.println("Enter Street Address: ");
                String streetAdd = scan.nextLine();
                System.out.println("Enter City Address: ");
                String cityAdd = scan.nextLine();
                System.out.println("Enter State Address: ");
                String stateAdd = scan.nextLine();
                System.out.println("Enter Zip Code Address: ");
                String zipCodeAdd = scan.nextLine(); 
                System.out.println("Enter Month: ");
                int month = Integer.parseInt(scan.nextLine()); // Use nextLine() and parse to avoid newline issues
                System.out.println("Enter Day: ");
                int day = Integer.parseInt(scan.nextLine()); // Use nextLine() and parse to avoid newline issues
                System.out.println("Enter Year: ");
                int year = Integer.parseInt(scan.nextLine()); // Use nextLine() and parse to avoid newline issues
                System.out.println("Enter Category: ");
                String category = scan.nextLine();
                temp.next = new Node(fName, lName, phoneNumber, streetAdd, cityAdd, stateAdd, zipCodeAdd, month, day, year, category);
                System.out.println("Entry added successfully!");
                temp.next.person.display();
                temp = temp.next;
                }
                head.next = temp;
            }
    }

    static void searchPerson(String lName)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.person.lastName.equalsIgnoreCase(lName))
            {
                System.out.println("Entry found!");
                temp.person.display();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Entry not found!");
    }

    static void deleteEntry(String lName)
    {
        Node temp = head;
        Node prev = null;
        while(temp != null)
        {
            if(temp.person.lastName.equalsIgnoreCase(lName))
            {
                if(prev == null) // Deleting the head
                {
                    head = temp.next;
                }
                else
                {
                    prev.next = temp.next;
                }
                System.out.println("Entry deleted successfully!");
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Entry not found!");
    }

    static void displayEntry()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("No entries found!");
            return;
        }
        while(temp != null)
        {
            temp.person.display();
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int option;
        do{
            System.out.println("""
                    [0] Terminate Program
                    [1] Insert data(End)
                    [2] Search Person(last name)
                    [3] Delete Entry(last name)
                    [4] Display person entry
                    [5] Display entry
                    """);
            System.out.print("Choose Option: ");
            option = scan.nextInt();

            switch(option){
                case 0 -> {
                    System.out.println("Program Terminated!");
                    System.exit(0);
                }
                case 1 -> {
                    do {
                        insertAtEnd();
                        System.out.println("Do you want to add another entry? (yes/no): ");
                        scan.nextLine(); 
                    } while (scan.nextLine().equalsIgnoreCase("no"));
                }
                case 2 ->
                {
                    System.out.println("Enter last name to search: ");
                    scan.nextLine(); // Consume the newline character left by nextInt()
                    String lName = scan.nextLine();
                    searchPerson(lName);
                }
                case 3 ->
                {
                    System.out.println("Enter last name to delete: ");
                    scan.nextLine(); // Consume the newline character left by nextInt()
                    String lName = scan.nextLine();
                    deleteEntry(lName);
                    
                }
                case 4 ->
                {
                    System.out.println("Enter last name to display: ");
                    scan.nextLine(); // Consume the newline character left by nextInt()
                    String lName = scan.nextLine();
                    searchPerson(lName);
                }
                case 5 ->
                {
                    System.out.println("Displaying all entries: ");
                    displayEntry();
                }
                // Other cases can be implemented similarly
            }
        }while(option != 0);
    scan.close();
    }
    
}
