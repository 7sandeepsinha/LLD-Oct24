package projects.ParkingLot.service.strategy;

import projects.ParkingLot.model.ParkingSpot;

public class SpotAssignmentStrategyFactory {

    public static SpotAssignmentStrategy getSpotAssignmentStrategy(){
        return new LinearSpotAssignmentStrategy();
    }
}
