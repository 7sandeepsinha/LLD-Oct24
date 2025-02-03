package projects.ParkingLot.repository;

import projects.ParkingLot.exception.VehicleNotFoundException;
import projects.ParkingLot.model.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VehicleRepository {
    private HashMap<Integer, Vehicle> vehicleMap;
    private static int counter = 1;

    public VehicleRepository() {
        this.vehicleMap = new HashMap<>();
    }
    
    public Vehicle save(Vehicle vehicle){
        vehicle.setId(counter++);
        vehicleMap.put(vehicle.getId(), vehicle);
        return vehicleMap.get(vehicle.getId());
    }
    
    public Vehicle findById(int vehicleId){
        if(vehicleMap.containsKey(vehicleId)){
            return vehicleMap.get(vehicleId);
        } else {
            throw new VehicleNotFoundException("Vehicle with given id does not exist : " + vehicleId);
        }
    }
    
    public Vehicle update(int vehicleId, Vehicle newVehicle){
        if(vehicleMap.containsKey(vehicleId)){
            return vehicleMap.put(vehicleId, newVehicle);
        } else {
            throw new VehicleNotFoundException("Vehicle with given id does not exist : " + vehicleId);
        }
    }
    
    public boolean delete(int vehicleId){
        if(vehicleMap.containsKey(vehicleId)){
            vehicleMap.remove(vehicleId);
            return true;
        } else {
            throw new VehicleNotFoundException("Vehicle with given id does not exist : " + vehicleId);
        }
    }

    public Vehicle getVehicleByNumber(String vehicleNumber){
        Set<Map.Entry<Integer,Vehicle>> vehicleEntrySet = vehicleMap.entrySet();
        for(Map.Entry<Integer, Vehicle> entry : vehicleEntrySet){
            if(entry.getValue().getVehicleNumber().equals(vehicleNumber)){
                return entry.getValue();
            }
        }
        throw new VehicleNotFoundException("Vehicle details not found");
    }
    
}
