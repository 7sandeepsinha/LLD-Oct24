package projects.ParkingLot.service.strategy;

import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingSpot;
import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constant.ParkingSpotTier;

public interface SpotAssignmentStrategy {
    ParkingSpot findSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotTier parkingSpotTier);
}
