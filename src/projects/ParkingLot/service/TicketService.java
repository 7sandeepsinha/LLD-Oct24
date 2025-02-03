package projects.ParkingLot.service;

import projects.ParkingLot.exception.VehicleNotFoundException;
import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingSpot;
import projects.ParkingLot.model.ParkingTicket;
import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constant.ParkingSpotStatus;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.model.constant.VehicleType;
import projects.ParkingLot.repository.*;
import projects.ParkingLot.service.strategy.SpotAssignmentStrategy;
import projects.ParkingLot.service.strategy.SpotAssignmentStrategyFactory;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TicketService {

    private ParkingGateRepository parkingGateRepository;
    private ParkingTicketRepository parkingTicketRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingLotRepository parkingLotRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(ParkingGateRepository parkingGateRepository, ParkingTicketRepository parkingTicketRepository,
                         ParkingSpotRepository parkingSpotRepository, ParkingLotRepository parkingLotRepository,
                         VehicleRepository vehicleRepository) {
        this.parkingGateRepository = parkingGateRepository;
        this.parkingTicketRepository = parkingTicketRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public ParkingTicket generateTicket(String vehicleNumber, ParkingLot parkingLot, ParkingSpotTier parkingSpotTier, int entryGate){
        Vehicle vehicle = null;
        try{
            vehicle = vehicleRepository.getVehicleByNumber(vehicleNumber);
        } catch (VehicleNotFoundException ve){
            Scanner sc = new Scanner(System.in);
            System.out.println("Vehicle does not exist with this number, please enter the details");
            System.out.println("Please enter the vehicle type - 1. 2 Wheeler, 2. 3 Wheeler, 4. 4 Wheeler");
            int vehicleType = sc.nextInt();
            System.out.println("Please enter the vehicle info");
            String vehicleInfo = sc.next();

            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleInfo(vehicleInfo);
            //TODO: change vehicleType based on the user input
            vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
            vehicle = vehicleRepository.save(vehicle);
        }
        return generateTicket(parkingLot, vehicle, parkingSpotTier, entryGate);
    }

    private ParkingTicket generateTicket(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotTier parkingSpotTier, int entryGateId) {
        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategy();
        ParkingSpot spot = spotAssignmentStrategy.findSpotForVehicle(parkingLot, vehicle, parkingSpotTier);

        ParkingTicket ticket = new ParkingTicket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setParkingSpot(spot);
        ticket.setVehicle(vehicle);
        ticket.setGate(parkingGateRepository.findById(entryGateId));
        ticket.setOperator(parkingGateRepository.findById(entryGateId).getOperator());

        ticket = parkingTicketRepository.save(ticket);

        spot.setSpotStatus(ParkingSpotStatus.OCCUPIED);
        spot = parkingSpotRepository.update(spot.getId(), spot);

        parkingLot.setAvailableSlots(parkingLot.getAvailableSlots() - 1);
        parkingLot = parkingLotRepository.update(parkingLot.getId(), parkingLot);

        return ticket;
    }

}
