class ExtPerson extends Person{
    String phone;
    Address address;
    Date date;
    String classification;

    public ExtPerson(String fName,String lName, String phoneNumber, String streetAdd, String cityAdd, String stateAdd, String zipCodeAdd, int month, int day, int year, String category)
    {
        super(fName, lName);
        phone = phoneNumber;

        //Initialized address and date to escape null pointer exception
        address = new Address();
        date = new Date();
        //Set address and date
        address.setAddress(streetAdd, cityAdd, stateAdd, zipCodeAdd);
        date.setDate(month, day, year);
        classification = category;
    }

    public void display()
    {
        System.out.println("\n\tEntry Details");
        System.out.println("Classification: " + classification);
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address.getAddress());
        System.out.println("Date: " + date.getDate());
    }
}

