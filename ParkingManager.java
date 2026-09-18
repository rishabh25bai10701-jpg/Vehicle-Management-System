import java.util.ArrayList;

public class ParkingManager {

    public ArrayList<Vehicle> vehicles;
    public ArrayList<ParkingSlot> slots;
    public ArrayList<ParkingRecord> records;

    public ParkingManager() {

        vehicles = new ArrayList<>();
        slots = new ArrayList<>();
        records = new ArrayList<>();

        // Create 10 parking slots
        for (int i = 1; i <= 10; i++) {
            slots.add(new ParkingSlot("A" + i));
        }
    }

    // Register a vehicle
    public boolean registerVehicle(Vehicle vehicle) {

        if (findVehicle(vehicle.getVehicleNumber()) != null) {
            return false;
        }

        vehicles.add(vehicle);
        return true;
    }

    // Find vehicle
    public Vehicle findVehicle(String vehicleNumber) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVehicleNumber()
                    .equalsIgnoreCase(vehicleNumber)) {

                return vehicle;
            }
        }

        return null;
    }

    // Find vehicle's current slot
    public ParkingSlot findVehicleSlot(String vehicleNumber) {

        for (ParkingSlot slot : slots) {

            if (slot.isOccupied()) {

                if (slot.getVehicle()
                        .getVehicleNumber()
                        .equalsIgnoreCase(vehicleNumber)) {

                    return slot;
                }
            }
        }

        return null;
    }

    // Find available slot
    public ParkingSlot findAvailableSlot() {

        for (ParkingSlot slot : slots) {

            if (!slot.isOccupied()) {
                return slot;
            }
        }

        return null;
    }

    // Park vehicle
    public String parkVehicle(String vehicleNumber) {

        Vehicle vehicle = findVehicle(vehicleNumber);

        if (vehicle == null) {
            return "Vehicle is not registered.";
        }

        if (findVehicleSlot(vehicleNumber) != null) {
            return "Vehicle is already parked.";
        }

        ParkingSlot slot = findAvailableSlot();

        if (slot == null) {
            return "No parking slot available.";
        }

        slot.parkVehicle(vehicle);

        ParkingRecord record =
                new ParkingRecord(vehicle, slot.getSlotNumber());

        records.add(record);

        return "Vehicle parked successfully in slot "
                + slot.getSlotNumber();
    }

    // Remove vehicle
    public ParkingRecord removeVehicle(String vehicleNumber) {

        ParkingSlot slot = findVehicleSlot(vehicleNumber);

        if (slot == null) {
            return null;
        }

        for (ParkingRecord record : records) {

            if (record.getVehicle()
                    .getVehicleNumber()
                    .equalsIgnoreCase(vehicleNumber)
                    && record.getExitTime() == null) {

                record.completeParking();

                slot.removeVehicle();

                return record;
            }
        }

        return null;
    }

    // Display parking slots
    public void displaySlots() {

        System.out.println("\n========== PARKING SLOTS ==========");

        for (ParkingSlot slot : slots) {

            if (slot.isOccupied()) {

                System.out.println(
                        slot.getSlotNumber()
                        + " -> OCCUPIED | Vehicle: "
                        + slot.getVehicle().getVehicleNumber()
                        + " | Type: "
                        + slot.getVehicle().getVehicleType()
                );

            } else {

                System.out.println(
                        slot.getSlotNumber()
                        + " -> AVAILABLE"
                );
            }
        }

        System.out.println("===================================\n");
    }

    // Display vehicle details
    public void displayVehicle(String vehicleNumber) {

        Vehicle vehicle = findVehicle(vehicleNumber);

        if (vehicle == null) {

            System.out.println("Vehicle not found.");
            return;
        }

        System.out.println("\n========== VEHICLE DETAILS ==========");

        System.out.println(
                "Vehicle Number : "
                + vehicle.getVehicleNumber()
        );

        System.out.println(
                "Owner Name     : "
                + vehicle.getOwnerName()
        );

        System.out.println(
                "Vehicle Type   : "
                + vehicle.getVehicleType()
        );

        System.out.println(
                "Hourly Rate    : Rs. "
                + vehicle.getHourlyRate()
        );

        ParkingSlot slot = findVehicleSlot(vehicleNumber);

        if (slot != null) {

            System.out.println(
                    "Parking Slot   : "
                    + slot.getSlotNumber()
            );

            System.out.println("Status         : PARKED");

        } else {

            System.out.println("Status         : NOT PARKED");
        }

        System.out.println("=====================================");
    }

    // Display parking history
    public void displayHistory() {

        if (records.isEmpty()) {

            System.out.println("\nNo parking history available.");
            return;
        }

        System.out.println(
                "\n============== PARKING HISTORY =============="
        );

        for (ParkingRecord record : records) {

            System.out.println(
                    "Vehicle : "
                    + record.getVehicle().getVehicleNumber()
            );

            System.out.println(
                    "Owner   : "
                    + record.getVehicle().getOwnerName()
            );

            System.out.println(
                    "Type    : "
                    + record.getVehicle().getVehicleType()
            );

            System.out.println(
                    "Slot    : "
                    + record.getSlotNumber()
            );

            System.out.println(
                    "Entry   : "
                    + record.getEntryTime()
            );

            System.out.println(
                    "Exit    : "
                    + record.getExitTime()
            );

            System.out.println(
                    "Fee     : Rs. "
                    + record.getFee()
            );

            System.out.println("----------------------------------------------");
        }
    }

    // Display statistics
    public void displayStatistics() {

        int totalSlots = slots.size();
        int occupiedSlots = 0;

        int cars = 0;
        int bikes = 0;

        double totalCollection = 0;

        for (ParkingSlot slot : slots) {

            if (slot.isOccupied()) {

                occupiedSlots++;

                if (slot.getVehicle()
                        .getVehicleType()
                        .equalsIgnoreCase("Car")) {

                    cars++;
                }

                if (slot.getVehicle()
                        .getVehicleType()
                        .equalsIgnoreCase("Bike")) {

                    bikes++;
                }
            }
        }

        for (ParkingRecord record : records) {

            totalCollection += record.getFee();
        }

        System.out.println(
                "\n========== PARKING STATISTICS =========="
        );

        System.out.println(
                "Total Slots      : " + totalSlots
        );

        System.out.println(
                "Occupied Slots   : " + occupiedSlots
        );

        System.out.println(
                "Available Slots  : "
                + (totalSlots - occupiedSlots)
        );

        System.out.println(
                "Cars Parked      : " + cars
        );

        System.out.println(
                "Bikes Parked     : " + bikes
        );

        System.out.println(
                "Total Collection : Rs. "
                + totalCollection
        );

        System.out.println(
                "========================================"
        );
    }
}
