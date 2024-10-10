package exceptions;

public class CommandNotFoundException extends Exception {

    public CommandNotFoundException() {}

    public CommandNotFoundException(String message) {
        super(message);
    }
}
