package projects.ParkingLot.service;

import projects.ParkingLot.model.*;
import projects.ParkingLot.model.constant.ParkingGateType;
import projects.ParkingLot.model.constant.ParkingSpotStatus;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.model.constant.VehicleType;
import projects.ParkingLot.repository.ParkingFloorRepository;
import projects.ParkingLot.repository.ParkingGateRepository;
import projects.ParkingLot.repository.ParkingLotRepository;
import projects.ParkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository; // mentioning the requirement for dependency
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingGateRepository parkingGateRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository,
                             ParkingSpotRepository parkingSpotRepository, ParkingGateRepository parkingGateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingGateRepository = parkingGateRepository;
    }

    public ParkingLot initialiseParkingLot(int noOfFloors, int noOfSpotInAFloor){
        Operator operator = new Operator(1, "Operator", "operator@operate.com");

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Parking Lot 1");
        parkingLot.setAddress("Street A, Place B, City C - 123456");

        ParkingGate entryGate = new ParkingGate();
        entryGate.setGateNumber("G01");
        entryGate.setGateType(ParkingGateType.ENTRY);
        entryGate.setOperator(operator);

        ParkingGate exitGate = new ParkingGate();
        exitGate.setGateNumber("G02");
        exitGate.setGateType(ParkingGateType.EXIT);
        exitGate.setOperator(operator);

        entryGate = parkingGateRepository.save(entryGate);
        exitGate = parkingGateRepository.save(exitGate);

        parkingLot.setGates(List.of(entryGate, exitGate));

        List<ParkingFloor> floors = new ArrayList<>();

        for(int i=1;i<=noOfFloors;i++){
            ParkingFloor floor = new ParkingFloor();
            floor.setFloorNumber(i);
            List<ParkingSpot> spots = new ArrayList<>();
            for(int j=1;j<=noOfSpotInAFloor;j++){
                ParkingSpot spot = new ParkingSpot();
                spot.setParkingSpotNumber(i + "0" + j);
                spot.setVehicleTypeSupported(VehicleType.FOUR_WHEELER);
                spot.setSpotStatus(ParkingSpotStatus.AVAILABLE);
                spot.setParkingSpotTier(ParkingSpotTier.NORMAL);
                spot = parkingSpotRepository.save(spot);
                spots.add(spot);
            }
            floor.setParkingSpots(spots);
            floor = parkingFloorRepository.save(floor);
            floors.add(floor);
        }

        parkingLot.setFloors(floors);
        int capacity = noOfFloors * noOfSpotInAFloor;
        parkingLot.setTotalCapacity(capacity);
        parkingLot.setAvailableSlots(capacity);

        return parkingLotRepository.save(parkingLot);
    }

    public void showParkingLot(ParkingLot parkingLot){
        for(int i=0;i<parkingLot.getFloors().size();i++){
            ParkingFloor floor = parkingLot.getFloors().get(i);
            System.out.println("FLOOR : " + floor.getFloorNumber());
            System.out.println("----------------------------------");
            for(ParkingSpot spot : floor.getParkingSpots()){
                System.out.print("|");
                if(spot.getSpotStatus().equals(ParkingSpotStatus.OCCUPIED)){
                    System.out.print("X");
                } else if(spot.getSpotStatus().equals(ParkingSpotStatus.AVAILABLE)) {
                    System.out.print(" ");
                } else {
                    System.out.print("-");
                }
                System.out.print("| ");
            }
            System.out.println();
            System.out.println("----------------------------------");
        }
        System.out.println("Available slots - "  + parkingLot.getAvailableSlots());
    }
}
