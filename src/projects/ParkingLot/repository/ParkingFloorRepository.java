package projects.ParkingLot.repository;

import projects.ParkingLot.exception.ParkingFloorNotFoundException;
import projects.ParkingLot.model.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorMap;
    private static int counter = 1;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor save(ParkingFloor parkingFloor){
        parkingFloor.setId(counter++);
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloorMap.get(parkingFloor.getId());
    }

    public ParkingFloor findById(int parkingFloorId){
        if(parkingFloorMap.containsKey(parkingFloorId)){
            return parkingFloorMap.get(parkingFloorId);
        } else {
            throw new ParkingFloorNotFoundException("Parking floor with given id does not exist : " + parkingFloorId);
        }
    }

    public ParkingFloor update(int parkingFloorId, ParkingFloor newParkingFloor){
        if(parkingFloorMap.containsKey(parkingFloorId)){
            return parkingFloorMap.put(parkingFloorId, newParkingFloor);
        } else {
            throw new ParkingFloorNotFoundException("Parking floor with given id does not exist : " + parkingFloorId);
        }
    }

    public boolean delete(int parkingFloorId){
        if(parkingFloorMap.containsKey(parkingFloorId)){
            parkingFloorMap.remove(parkingFloorId);
            return true;
        } else {
            throw new ParkingFloorNotFoundException("Parking floor with given id does not exist : " + parkingFloorId);
        }
    }

}
