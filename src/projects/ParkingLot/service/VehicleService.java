package projects.ParkingLot.service;

import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.repository.VehicleRepository;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle getVehicleDetails(String number){
        return vehicleRepository.getVehicleByNumber(number);
    }
}
