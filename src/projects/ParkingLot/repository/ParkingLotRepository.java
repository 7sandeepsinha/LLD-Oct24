package projects.ParkingLot.repository;

import projects.ParkingLot.exception.ParkingLotNotFoundException;
import projects.ParkingLot.model.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotMap;
    private static int counter = 1;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }
    
    public ParkingLot save(ParkingLot parkingLot){
        parkingLot.setId(counter++);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        return parkingLotMap.get(parkingLot.getId());
    }
    
    public ParkingLot findById(int parkingLotId){
        if(parkingLotMap.containsKey(parkingLotId)){
            return parkingLotMap.get(parkingLotId);
        } else {
            throw new ParkingLotNotFoundException("Parking lot with given id does not exist : " + parkingLotId);
        }
    }
    
    public ParkingLot update(int parkingLotId, ParkingLot newParkingLot){
        if(parkingLotMap.containsKey(parkingLotId)){
            return parkingLotMap.put(parkingLotId, newParkingLot);
        } else {
            throw new ParkingLotNotFoundException("Parking lot with given id does not exist : " + parkingLotId);
        }
    }
    
    public boolean delete(int parkingLotId){
        if(parkingLotMap.containsKey(parkingLotId)){
            parkingLotMap.remove(parkingLotId);
            return true;
        } else {
            throw new ParkingLotNotFoundException("Parking lot with given id does not exist : " + parkingLotId);
        }
    }
    
}
