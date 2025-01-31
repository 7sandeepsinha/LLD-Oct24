package projects.ParkingLot.exception;

public class ParkingSpotNotFoundException extends RuntimeException{
    public ParkingSpotNotFoundException() {
    }

    public ParkingSpotNotFoundException(String message) {
        super(message);
    }

    public ParkingSpotNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotNotFoundException(Throwable cause) {
        super(cause);
    }
}
