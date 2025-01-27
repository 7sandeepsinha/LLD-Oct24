package projects.TicTacToe.exception;

public class GameDrawnException extends RuntimeException{
    public GameDrawnException() {
    }

    public GameDrawnException(String message) {
        super(message);
    }

    public GameDrawnException(String message, Throwable cause) {
        super(message, cause);
    }
}
