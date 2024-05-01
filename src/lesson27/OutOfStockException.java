package lesson27;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException(String errorMessage) {
        super(errorMessage);
    }
}
