package lection2.Exception;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        super("Login не соответствует требованиям");
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
