package lection2.Exception;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        super("Password не соответствует требованиям");
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
