import java.util.Scanner;

// SUPER CLASS
class Car {
    private String price;
    private String model;
    // Constructor to initialize the car's price and model
    public Car(String price, String model) {
        this.price = price;
        this.model = model;
    }
    // Method to display car information
    public void displayInfo() {
        System.out.println("Price: " + price);
        System.out.println("Model: " + model);
    }
}

// SUBCLASS INHERIT FROM SUPERCLASS
class ElectricCar extends Car {
    private int batteryCapacity;
    // Constructor to initialize the electric car's price, model, and battery capacity
    public ElectricCar(String price, String model, int batteryCapacity) {
        super(price, model);  // Call the constructor of the superclass Car
        this.batteryCapacity = batteryCapacity;
    }
    // Display car information, including battery capacity
    public void displayInfo() {
        super.displayInfo();  // Call the displayInfo method of the superclass Car
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// MAIN CLASS
public class CarSystem {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter details for the electric car:");
            // Get user input for the electric car's price, model, and battery capacity
            System.out.print("Enter price: ");
            String price = scanner.nextLine();
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter battery capacity (kWh): ");
            int batteryCapacity = scanner.nextInt();
            scanner.nextLine();  
            // Create an instance of ElectricCar using the provided user input
            ElectricCar electricCar = new ElectricCar(price, model, batteryCapacity);
            System.out.println("\nElectric Car Information:");
            // Display the information of the created electric car
            electricCar.displayInfo();
        } catch (Exception e) {
            // Handle any exceptions that might occur during input or object creation
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
