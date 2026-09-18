import java.util.InputMismatchException;
import java.util.Scanner;

public class ParkingSystem {

    public ParkingManager manager;
    public Scanner scanner;

    public ParkingSystem() {
        manager = new ParkingManager();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice = 0;

        do {
            System.out.println("\n=================================");
            System.out.println("     SMART PARKING SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Register Vehicle");
            System.out.println("2. Park Vehicle");
            System.out.println("3. Remove Vehicle");
            System.out.println("4. Display Parking Slots");
            System.out.println("5. Vehicle Details");
            System.out.println("6. Parking History");
            System.out.println("7. Parking Statistics");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");

            // Input validation to prevent crashes on non-integer input
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the newline character from the buffer
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 8.");
                scanner.nextLine(); // Clear invalid input from the buffer
                continue; // Restart the loop
            }

            switch (choice){
                case 1:
                    registerVehicle();
                    break;
                case 2:
                    parkVehicle();
                    break;
                case 3:
                    removeVehicle();
                    break;
                case 4:
                    manager.displaySlots();
                    break;
                case 5:
                    vehicleDetails();
                    break;
                case 6:
                    manager.displayHistory();
                    break;
                case 7:
                    manager.displayStatistics();
                    break;
                case 8:
                    System.out.println("\nThank you for using Smart Parking System!");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);
    }

    // Register vehicle
    private void registerVehicle() {
        System.out.println("\n----- REGISTER VEHICLE -----");

        System.out.print("Enter vehicle number: ");
        String number = scanner.nextLine().trim();

        System.out.print("Enter owner name: ");
        String owner = scanner.nextLine().trim();

        System.out.print("Enter vehicle type (Car/Bike): ");
        String type = scanner.nextLine().trim();

        if (!type.equalsIgnoreCase("Car") && !type.equalsIgnoreCase("Bike")) {
            System.out.println("Invalid vehicle type.");
            return;
        }

        Vehicle vehicle = new Vehicle(number, owner, type);
        boolean result = manager.registerVehicle(vehicle);

        if (result) {
            System.out.println("Vehicle registered successfully.");
        } else {
            System.out.println("Vehicle is already registered.");
        }
    }

    // Park vehicle
    private void parkVehicle() {
        System.out.println("\n----- PARK VEHICLE -----");

        System.out.print("Enter vehicle number: ");
        String number = scanner.nextLine().trim();

        String result = manager.parkVehicle(number);
        System.out.println(result);
    }

    // Remove vehicle
    private void removeVehicle() {
        System.out.println("\n----- REMOVE VEHICLE -----");

        System.out.print("Enter vehicle number: ");
        String number = scanner.nextLine().trim();

        ParkingRecord record = manager.removeVehicle(number);

        if (record == null) {
            System.out.println("Vehicle is not currently parked.");
        } else {
            System.out.println("\nVehicle removed successfully.");
            System.out.println("Parking Slot : " + record.getSlotNumber());
            System.out.println("Parking Fee  : Rs. " + record.getFee());
        }
    }

    // Vehicle details
    private void vehicleDetails() {
        System.out.println("\n----- VEHICLE DETAILS -----");

        System.out.print("Enter vehicle number: ");
        String number = scanner.nextLine().trim();

        manager.displayVehicle(number);
    }
}
