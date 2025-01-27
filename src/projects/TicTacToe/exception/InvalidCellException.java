package projects.TicTacToe.exception;

public class InvalidCellException extends RuntimeException{
    public InvalidCellException() {
    }

    public InvalidCellException(String message) {
        super(message);
    }

    public InvalidCellException(String message, Throwable cause) {
        super(message, cause);
    }
}
