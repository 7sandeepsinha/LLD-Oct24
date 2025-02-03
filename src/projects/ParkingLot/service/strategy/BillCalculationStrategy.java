package projects.ParkingLot.service.strategy;

import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.model.constant.VehicleType;

public interface BillCalculationStrategy {
    double generateOverallBill(int duration, VehicleType vehicleType, ParkingSpotTier tier);
}
