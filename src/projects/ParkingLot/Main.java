package projects.ParkingLot;

import projects.ParkingLot.controller.BillController;
import projects.ParkingLot.controller.ParkingLotController;
import projects.ParkingLot.controller.TicketController;
import projects.ParkingLot.model.Bill;
import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingTicket;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.repository.*;
import projects.ParkingLot.service.BillService;
import projects.ParkingLot.service.ParkingLotService;
import projects.ParkingLot.service.TicketService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BillRepository billRepository = new BillRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(); // initialised a parkingLotRepo object, available for injection
        ParkingGateRepository parkingGateRepository = new ParkingGateRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingTicketRepository parkingTicketRepository = new ParkingTicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository,
                parkingFloorRepository, parkingSpotRepository, parkingGateRepository); // initialising parkingLotService, ie, while object creation the dependency will be injected
        TicketService ticketService = new TicketService(parkingGateRepository,
                parkingTicketRepository, parkingSpotRepository, parkingLotRepository, vehicleRepository);
        BillService billService = new BillService(parkingTicketRepository,
                billRepository, parkingGateRepository, parkingSpotRepository, parkingLotRepository);

        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
        TicketController ticketController = new TicketController(ticketService);
        BillController billController = new BillController(billService);

        ParkingLot parkingLot = parkingLotController.initialiseParkingLot(1, 3);
        parkingLotController.displayParkingLot(parkingLot);

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Parking Lot system");

        while (true){
            System.out.println("Choose one of the following : ");
            System.out.println("1. Enter new vehicle");
            System.out.println("2. Exit vehicle");
            int option = sc.nextInt();
            if(option == 1){
                if(parkingLotController.isSlotAvailable(parkingLot)){
                    System.out.println("Please enter vehicle number");
                    String number = sc.next();
                    ParkingTicket ticket = ticketController.generateTicket(parkingLot, number, ParkingSpotTier.NORMAL, 1);
                    ticketController.displayTicketDetails(ticket);
                    parkingLotController.displayParkingLot(parkingLot);
                } else {
                    System.out.println("Parking Lot is full, please try again later");
                }
            } else {
                System.out.println("Please enter your ticketId");
                int ticketId = sc.nextInt();
                Bill bill = billController.generateBill(parkingLot, ticketId, 2);
                billController.displayBillDetails(bill);
                parkingLotController.displayParkingLot(parkingLot);
            }
        }
    }
}
