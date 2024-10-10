package exceptions;

public class CommandsEmptyException extends Exception {

    public CommandsEmptyException() {}

    public CommandsEmptyException(String message) {
        super(message);
    }
}
