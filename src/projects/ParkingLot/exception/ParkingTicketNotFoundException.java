package projects.ParkingLot.exception;

public class ParkingTicketNotFoundException extends RuntimeException{
    public ParkingTicketNotFoundException() {
    }

    public ParkingTicketNotFoundException(String message) {
        super(message);
    }

    public ParkingTicketNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingTicketNotFoundException(Throwable cause) {
        super(cause);
    }
}
