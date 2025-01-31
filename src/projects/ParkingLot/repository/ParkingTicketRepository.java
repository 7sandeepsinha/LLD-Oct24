package projects.ParkingLot.repository;

import projects.ParkingLot.exception.ParkingTicketNotFoundException;
import projects.ParkingLot.model.ParkingTicket;

import java.util.HashMap;

public class ParkingTicketRepository {
    private HashMap<Integer, ParkingTicket> parkingParkingTicketMap;
    private static int counter = 1;

    public ParkingTicketRepository() {
        this.parkingParkingTicketMap = new HashMap<>();
    }

    public ParkingTicket save(ParkingTicket parkingParkingTicket){
        parkingParkingTicket.setId(counter++);
        parkingParkingTicketMap.put(parkingParkingTicket.getId(), parkingParkingTicket);
        return parkingParkingTicketMap.get(parkingParkingTicket.getId());
    }

    public ParkingTicket findById(int parkingParkingTicketId){
        if(parkingParkingTicketMap.containsKey(parkingParkingTicketId)){
            return parkingParkingTicketMap.get(parkingParkingTicketId);
        } else {
            throw new ParkingTicketNotFoundException("Parking floor with given id does not exist : " + parkingParkingTicketId);
        }
    }

    public ParkingTicket update(int parkingParkingTicketId, ParkingTicket newParkingTicket){
        if(parkingParkingTicketMap.containsKey(parkingParkingTicketId)){
            return parkingParkingTicketMap.put(parkingParkingTicketId, newParkingTicket);
        } else {
            throw new ParkingTicketNotFoundException("Parking floor with given id does not exist : " + parkingParkingTicketId);
        }
    }

    public boolean delete(int parkingParkingTicketId){
        if(parkingParkingTicketMap.containsKey(parkingParkingTicketId)){
            parkingParkingTicketMap.remove(parkingParkingTicketId);
            return true;
        } else {
            throw new ParkingTicketNotFoundException("Parking floor with given id does not exist : " + parkingParkingTicketId);
        }
    }

}
