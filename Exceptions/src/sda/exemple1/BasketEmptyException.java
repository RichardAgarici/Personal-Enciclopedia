package sda.exemple1;

public class BasketEmptyException extends RuntimeException{
    public BasketEmptyException(String message) {
        super(message);
    }
}