package projects.ParkingLot.service.strategy;

import projects.ParkingLot.model.constant.ParkingSpotTier;
import projects.ParkingLot.model.constant.VehicleType;

public class LinearBillCalculationStrategy implements BillCalculationStrategy {

    @Override
    public double generateOverallBill(int duration, VehicleType vehicleType, ParkingSpotTier tier) {
        return 10 * duration;
    }
}
