package projects.ParkingLot.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class ParkingTicket {
    private int id;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingGate gate;
    private Operator operator;

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "parkingSpot=" + parkingSpot.getParkingSpotNumber() +
                ", entryTime=" + entryTime +
                ", vehicle=" + vehicle.getVehicleNumber() +
                ", gate=" + gate.getGateNumber() +
                ", operator=" + operator.getName() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingGate getGate() {
        return gate;
    }

    public void setGate(ParkingGate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
