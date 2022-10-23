package Exceptions;

//Custom Exception
public class WrongDataException extends RuntimeException{

    public WrongDataException() {
        super("Invalid data inputted");
    }

    public WrongDataException(String message) {
        super(message);
    }
}
