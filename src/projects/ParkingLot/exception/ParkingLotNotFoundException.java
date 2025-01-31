package projects.ParkingLot.exception;

public class ParkingLotNotFoundException extends RuntimeException{
    public ParkingLotNotFoundException() {
    }

    public ParkingLotNotFoundException(String message) {
        super(message);
    }

    public ParkingLotNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingLotNotFoundException(Throwable cause) {
        super(cause);
    }
}
