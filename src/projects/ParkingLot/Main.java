package projects.ParkingLot;

import projects.ParkingLot.controller.BillController;
import projects.ParkingLot.controller.ParkingLotController;
import projects.ParkingLot.controller.TicketController;
import projects.ParkingLot.model.Bill;
import projects.ParkingLot.model.ParkingTicket;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.repository.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BillRepository billRepository = new BillRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingGateRepository parkingGateRepository = new ParkingGateRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingTicketRepository parkingTicketRepository = new ParkingTicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        ParkingLotController parkingLotController = new ParkingLotController();
        TicketController ticketController = new TicketController();
        BillController billController = new BillController();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Parking Lot system");

        while (true){
            System.out.println("Choose one of the following : ");
            System.out.println("1. Enter new vehicle");
            System.out.println("2. Exit vehicle");
            int option = sc.nextInt();
            if(option == 1){
                if(parkingLotController.isSlotAvailable()){
                    System.out.println("Please enter vehicle number");
                    String number = sc.next();
                    ParkingTicket ticket = parkingLotController.generateTicket(number, ParkingSpotTier.NORMAL, 1);
                    ticketController.displayTicketDetails(ticket);
                    parkingLotController.displayParkingLotStatus();
                } else {
                    System.out.println("Parking Lot is full, please try again later");
                }
            } else {
                System.out.println("Please enter your ticketId");
                int ticketId = sc.nextInt();
                Bill bill = parkingLotController.generateBill(ticketId, 2);
                billController.displayBillDetails(bill);
                System.out.println("Choose a payment mode - 1. Cash and 2. Online");
                int paymentMode = sc.nextInt();
                //generate bill object with payment
                //display bill
                parkingLotController.displayParkingLotStatus();
            }
        }
    }
}
