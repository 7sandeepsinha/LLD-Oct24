package projects.ParkingLot.controller;

import projects.ParkingLot.model.Bill;
import projects.ParkingLot.model.ParkingTicket;
import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.model.constant.VehicleType;

public class ParkingLotController {

    public boolean isSlotAvailable(){
        return true;
    }

    public boolean isSlotAvailable(VehicleType vehicleType){ // TODO: complete this method
        return true;
    }

    public ParkingTicket generateTicket(String vehicleNumber, ParkingSpotTier parkingSpotTier, int entryGateId){
        //if vehicle details are not present, take user input
        // call generateTicket(vehicle vehicle,-----)
        return null;
    }

    public ParkingTicket generateTicket(Vehicle vehicle, ParkingSpotTier parkingSpotTier, int entryGateId){
        return null;
    }

    public Bill generateBill(int ticketId, int exitGateId){
        return null;
    }

    public Bill billPayment(Bill bill){
        return null;
    }

    public void displayParkingLotStatus(){
        return;
    }

}
