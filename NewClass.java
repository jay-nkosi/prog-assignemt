import java.util.Scanner;

// Base class for any kind of store
abstract class Store {
    protected String storeName;
    protected String deviceType;
    protected double totalSales;

    public Store(String storeName, String deviceType, double totalSales) {
        this.storeName = storeName;
        this.deviceType = deviceType;
        this.totalSales = totalSales;
    }

    // Every store must be able to show its details
    public abstract void displayDetails();
}

// Specialised class for electronic stores
class ElectronicStore extends Store {

    public ElectronicStore(String storeName, String deviceType, double totalSales) {
        super(storeName, deviceType, totalSales);
    }

    @Override
    public void displayDetails() {
        System.out.println("\n------------------------------");
        System.out.println("  Electronic Store Summary");
        System.out.println("------------------------------");
        System.out.println("Store Name   : " + storeName);
        System.out.println("Console      : " + deviceType);
        System.out.printf("Total Sales  : R%.2f%n", totalSales);
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Electronic Store Manager ===");
        System.out.println("Let's capture some store details.\n");

        // Store name
        System.out.print("What is the name of the store? ");
        String storeName = input.nextLine().trim();

        // Console selection
        System.out.println("\nWhich console is this store mainly selling?");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X");
        System.out.println("3. Nintendo Switch");
        System.out.println("4. Other");
        System.out.print("Enter the number of your choice: ");

        int choice = input.nextInt();
        input.nextLine(); // clear the leftover newline

        String deviceType;
        switch (choice) {
            case 1 -> deviceType = "PlayStation 5";
            case 2 -> deviceType = "Xbox Series X";
            case 3 -> deviceType = "Nintendo Switch";
            case 4 -> {
                System.out.print("Please type the console name: ");
                deviceType = input.nextLine().trim();
            }
            default -> {
                deviceType = "Unknown";
                System.out.println("That wasn't a valid option, so I've marked it as Unknown.");
            }
        }

        // Sales amount
        System.out.print("\nEnter the total sales amount (R): ");
        double totalSales = input.nextDouble();

        // Create the store object and show the summary
        ElectronicStore store = new ElectronicStore(storeName, deviceType, totalSales);
        store.displayDetails();

        System.out.println("\nThanks for using the Electronic Store Manager!");
        input.close();
    }
}