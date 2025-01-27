package projects.TicTacToe.exception;

public class DuplicateSymbolException extends RuntimeException{
    public DuplicateSymbolException() {
    }

    public DuplicateSymbolException(String message) {
        super(message);
    }

    public DuplicateSymbolException(String message, Throwable cause) {
        super(message, cause);
    }
}
