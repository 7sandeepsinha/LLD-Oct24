package projects.ParkingLot.service;

import projects.ParkingLot.model.Bill;
import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingSpot;
import projects.ParkingLot.model.ParkingTicket;
import projects.ParkingLot.model.constant.ParkingSpotStatus;
import projects.ParkingLot.repository.*;
import projects.ParkingLot.service.strategy.BillCalculationStrategy;
import projects.ParkingLot.service.strategy.BillCalculationStrategyFactory;
import projects.TicTacToe.service.strategy.BotPlayingStrategyFactory;

import java.time.LocalDateTime;

public class BillService {
    private ParkingTicketRepository parkingTicketRepository;
    private BillRepository billRepository;
    private ParkingGateRepository parkingGateRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingLotRepository parkingLotRepository;

    public BillService(ParkingTicketRepository parkingTicketRepository, BillRepository billRepository,
                       ParkingGateRepository parkingGateRepository, ParkingSpotRepository parkingSpotRepository,
                       ParkingLotRepository parkingLotRepository) {
        this.parkingTicketRepository = parkingTicketRepository;
        this.billRepository = billRepository;
        this.parkingGateRepository = parkingGateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Bill generateBill(ParkingLot parkingLot, int ticketId, int exitGateId){
        ParkingTicket ticket = parkingTicketRepository.findById(ticketId);

        Bill bill = new Bill();
        bill.setExitTime(LocalDateTime.now());
        bill.setParkingTicket(ticket);
        bill.setExitGate(parkingGateRepository.findById(exitGateId));
        bill.setOperator(parkingGateRepository.findById(exitGateId).getOperator());

        int duration = LocalDateTime.now().getSecond() - ticket.getEntryTime().getSecond();

        BillCalculationStrategy strategy = BillCalculationStrategyFactory.getBillCalculationStrategy();
        double amount = strategy.generateOverallBill(duration, ticket.getVehicle().getVehicleType(), ticket.getParkingSpot().getParkingSpotTier());
        bill.setAmount(amount);

        ParkingSpot spot = ticket.getParkingSpot();
        spot.setSpotStatus(ParkingSpotStatus.AVAILABLE);
        spot = parkingSpotRepository.update(spot.getId(), spot);

        parkingLot.setAvailableSlots(parkingLot.getAvailableSlots() + 1);
        parkingLot = parkingLotRepository.update(parkingLot.getId(), parkingLot);

        return billRepository.save(bill);
    }
}
