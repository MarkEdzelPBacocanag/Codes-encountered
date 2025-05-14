
public class Address 
{
    String street;
    String city;
    String state;
    String zipCode;

    public void setAddress(String streetAddress, String cityAddress, String stateAddress, String  zipCodeAddress)
    {
        street = streetAddress;
        city = cityAddress;
        state = stateAddress;
        zipCode = zipCodeAddress;
    }
    

    public String getAddress()
    {
        return street +" "+ city +" "+ state +" "+ zipCode;
    }
}
