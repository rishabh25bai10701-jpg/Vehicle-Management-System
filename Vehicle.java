public class Vehicle {

    public String vehicleNumber;
    public String ownerName;
    public String vehicleType;
    public double hourlyRate;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;

        if (vehicleType.equalsIgnoreCase("Car")) {
            hourlyRate = 50;
        } else {
            hourlyRate = 30;
        }
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
