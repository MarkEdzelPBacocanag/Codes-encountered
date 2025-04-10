import java.util.*;

public class FirstAddressExercise{
    public static void main(String[] args) {
        System.out.println("First Java application");
        String brand;
        @SuppressWarnings("unused")
        String[] phoneBrands = {"Apple", "Samsung", "MyPhone", "Xiaomi", "Nokia", "Techno", "Vivo", "Realme", "Infinix", "Cherry Mobile"};

        Scanner scan;
            scan = new Scanner(System.in);
            System.out.println("Phone Brands [Apple, Samsung, MyPhone, Xiaomi, Nokia, Techno, Vivo, Realme, Infinix, Cherry Mobile]\n\nPLease enter phone brand: ");
            brand = scan.nextLine();

            System.out.println("Company: " + brand + "\nCompany: " + getAddress(brand));

    scan.close();
    }

    public static String getAddress(String brand) {
        String address;
        switch (brand) {
            case "Apple":
                address = "Colon St.";
                break;
            case "Samsung":
                address = "Bohol";
                break;
            case "MyPhone":
                address = "Osmena Blvd";
                break;
            case "Xiaomi":
                address = "Beijing";
            case "Nokia":
                address = "Finland";
            case "Techno":
                address = "Shenzhen";
                break;
            case "Vivo":
                address = "Guangdong Province";
                break;
            case "Realme":
                address = "Shenzhen";
                break;
            case "Infinix":
                address = "Shenzhen";
                break;
            case "Cherry Mobile":
                address = "Metro Manila";
                break;
            default:
                address = "Address not found";
        }
        return address;
    }
}
