package projects.ParkingLot.repository;

import projects.ParkingLot.exception.ParkingGateNotFoundException;
import projects.ParkingLot.model.ParkingGate;

import java.util.HashMap;

public class ParkingGateRepository {
    private HashMap<Integer, ParkingGate> parkingGateMap;
    private static int counter = 1;

    public ParkingGateRepository() {
        this.parkingGateMap = new HashMap<>();
    }

    public ParkingGate save(ParkingGate parkingGate){
        parkingGate.setId(counter++);
        parkingGateMap.put(parkingGate.getId(), parkingGate);
        return parkingGateMap.get(parkingGate.getId());
    }

    public ParkingGate findById(int parkingGateId){
        if(parkingGateMap.containsKey(parkingGateId)){
            return parkingGateMap.get(parkingGateId);
        } else {
            throw new ParkingGateNotFoundException("Parking gate with given id does not exist : " + parkingGateId);
        }
    }

    public ParkingGate update(int parkingGateId, ParkingGate newParkingGate){
        if(parkingGateMap.containsKey(parkingGateId)){
            return parkingGateMap.put(parkingGateId, newParkingGate);
        } else {
            throw new ParkingGateNotFoundException("Parking gate with given id does not exist : " + parkingGateId);
        }
    }

    public boolean delete(int parkingGateId){
        if(parkingGateMap.containsKey(parkingGateId)){
            parkingGateMap.remove(parkingGateId);
            return true;
        } else {
            throw new ParkingGateNotFoundException("Parking gate with given id does not exist : " + parkingGateId);
        }
    }

}
