package projects.ParkingLot.controller;

import projects.ParkingLot.model.Bill;
import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingTicket;
import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.model.constant.VehicleType;
import projects.ParkingLot.service.ParkingLotService;

public class ParkingLotController {

    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLot) {
        this.parkingLotService = parkingLot;
    }

    public boolean isSlotAvailable(ParkingLot parkingLot){
        return parkingLot.getAvailableSlots() > 0;
    }

    public boolean isSlotAvailable(VehicleType vehicleType){ // TODO: complete this method
        return true;
    }


    public Bill billPayment(Bill bill){
        return null;
    }


    public ParkingLot initialiseParkingLot(int noOfFloors, int noOfSpotInAFloor){
        //TODO: add validations for practical range of noOfFloors, and noOfSpotInAFloor
        return parkingLotService.initialiseParkingLot(noOfFloors, noOfSpotInAFloor);
    }

    public void displayParkingLot(ParkingLot parkingLot){
        parkingLotService.showParkingLot(parkingLot);
    }

}
