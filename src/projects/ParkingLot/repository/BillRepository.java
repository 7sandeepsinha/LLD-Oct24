package projects.ParkingLot.repository;

import projects.ParkingLot.exception.BillNotFoundException;
import projects.ParkingLot.model.Bill;

import java.util.HashMap;

public class BillRepository {
    private HashMap<Integer, Bill> billMap;
    private static int counter = 1;

    public BillRepository() {
        this.billMap = new HashMap<>();
    }
    
    public Bill save(Bill bill){
        bill.setId(counter++);
        billMap.put(bill.getId(), bill);
        return billMap.get(bill.getId());
    }
    
    public Bill findById(int billId){
        if(billMap.containsKey(billId)){
            return billMap.get(billId);
        } else {
            throw new BillNotFoundException("Bill with given id does not exist : " + billId);
        }
    }
    
    public Bill update(int billId, Bill newBill){
        if(billMap.containsKey(billId)){
            return billMap.put(billId, newBill);
        } else {
            throw new BillNotFoundException("Bill with given id does not exist : " + billId);
        }
    }
    
    public boolean delete(int billId){
        if(billMap.containsKey(billId)){
            billMap.remove(billId);
            return true;
        } else {
            throw new BillNotFoundException("Bill with given id does not exist : " + billId);
        }
    }
    
}
