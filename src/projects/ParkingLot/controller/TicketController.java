package projects.ParkingLot.controller;

import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingTicket;
import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public void displayTicketDetails(ParkingTicket parkingTicket){
        System.out.println(parkingTicket);
    }

    public ParkingTicket generateTicket(ParkingLot parkingLot, String vehicleNumber, ParkingSpotTier parkingSpotTier, int entryGateId){
        return ticketService.generateTicket(vehicleNumber,parkingLot, parkingSpotTier, entryGateId);
    }

}
