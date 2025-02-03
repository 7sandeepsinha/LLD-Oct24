package projects.ParkingLot.service.strategy;

import projects.ParkingLot.exception.ParkingSpotNotAvailableException;
import projects.ParkingLot.model.ParkingFloor;
import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingSpot;
import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constant.ParkingSpotStatus;
import projects.ParkingLot.model.constant.ParkingSpotTier;

public class LinearSpotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot findSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotTier parkingSpotTier) {
        for(ParkingFloor floor : parkingLot.getFloors()){
            for(ParkingSpot spot : floor.getParkingSpots()){
                if(spot.getSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                && spot.getVehicleTypeSupported().equals(vehicle.getVehicleType())
                && spot.getParkingSpotTier().equals(parkingSpotTier)){
                    return spot;
                }
            }
        }
        throw new ParkingSpotNotAvailableException("No parking spot found");
    }
}
