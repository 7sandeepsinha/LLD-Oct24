package projects.ParkingLot.model;

import projects.ParkingLot.model.constant.ParkingSpotStatus;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.model.constant.VehicleType;

public class ParkingSpot {
    private int id;
    private String parkingSpotNumber;
    private ParkingSpotStatus spotStatus;
    private VehicleType vehicleTypeSupported;
    private ParkingSpotTier parkingSpotTier;
    private Vehicle vehicle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public ParkingSpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(ParkingSpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public VehicleType getVehicleTypeSupported() {
        return vehicleTypeSupported;
    }

    public void setVehicleTypeSupported(VehicleType vehicleTypeSupported) {
        this.vehicleTypeSupported = vehicleTypeSupported;
    }

    public ParkingSpotTier getParkingSpotTier() {
        return parkingSpotTier;
    }

    public void setParkingSpotTier(ParkingSpotTier parkingSpotTier) {
        this.parkingSpotTier = parkingSpotTier;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
