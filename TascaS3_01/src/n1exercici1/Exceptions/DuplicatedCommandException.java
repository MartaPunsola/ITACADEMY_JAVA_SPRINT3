package Exceptions;

public class DuplicatedCommandException extends Exception {

    public DuplicatedCommandException() {}

    public DuplicatedCommandException(String message) {
        super(message);
    }
}
