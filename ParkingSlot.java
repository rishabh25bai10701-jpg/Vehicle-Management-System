public class ParkingSlot {

    public String slotNumber;
    public Vehicle vehicle;

    public ParkingSlot(String slotNumber) {
        this.slotNumber = slotNumber;
        this.vehicle = null;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isOccupied() {
        return vehicle != null;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }
}
