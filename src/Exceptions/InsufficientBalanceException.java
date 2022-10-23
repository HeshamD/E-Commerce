package Exceptions;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException() {
        super("Insufficient funds in your account");
    }
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
