package projects.ParkingLot.exception;

public class ParkingGateNotFoundException extends RuntimeException{
    public ParkingGateNotFoundException() {
    }

    public ParkingGateNotFoundException(String message) {
        super(message);
    }

    public ParkingGateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingGateNotFoundException(Throwable cause) {
        super(cause);
    }
}
