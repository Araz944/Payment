package lesson24;

public class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException(String message) {
        super(message);
    }

    public CustomNullPointerException() {

    }
}
