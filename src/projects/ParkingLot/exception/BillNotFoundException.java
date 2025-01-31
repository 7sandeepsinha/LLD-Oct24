package projects.ParkingLot.exception;

public class BillNotFoundException extends RuntimeException{
    public BillNotFoundException() {
    }

    public BillNotFoundException(String message) {
        super(message);
    }

    public BillNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BillNotFoundException(Throwable cause) {
        super(cause);
    }
}
