package projects.ParkingLot.model;

import java.util.List;

public class ParkingLot {
    private int id;
    private String name; // parkingLotName
    private String address; // address for parking Lot
    private List<ParkingFloor> floors;
    private List<ParkingGate> gates;
    private int totalCapacity;
    private int availableSlots;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<ParkingGate> getGates() {
        return gates;
    }

    public void setGates(List<ParkingGate> gates) {
        this.gates = gates;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(int availableSlots) {
        this.availableSlots = availableSlots;
    }
}
