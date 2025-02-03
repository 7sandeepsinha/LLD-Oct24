package projects.ParkingLot.controller;

import projects.ParkingLot.model.Bill;
import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.service.BillService;

public class BillController {

    private BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public void displayBillDetails(Bill bill){
        System.out.println(bill);
    }

    public Bill generateBill(ParkingLot parkingLot, int ticketId, int exitGateId){
        return billService.generateBill(parkingLot, ticketId, exitGateId);
    }
}
