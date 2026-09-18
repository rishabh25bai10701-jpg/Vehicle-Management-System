import java.time.LocalDateTime;
import java.time.Duration;

public class ParkingRecord {

    public Vehicle vehicle;
    public String slotNumber;

    public LocalDateTime entryTime;
    public LocalDateTime exitTime;

    public double fee;

    public ParkingRecord(Vehicle vehicle, String slotNumber) {

        this.vehicle = vehicle;
        this.slotNumber = slotNumber;

        entryTime = LocalDateTime.now();
        exitTime = null;
        fee = 0;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public double getFee() {
        return fee;
    }

    public void completeParking() {

        exitTime = LocalDateTime.now();

        long minutes = Duration.between(entryTime, exitTime).toMinutes();

        long hours = (minutes + 59) / 60;

        if (hours < 1) {
            hours = 1;
        }

        fee = hours * vehicle.getHourlyRate();
    }
}
