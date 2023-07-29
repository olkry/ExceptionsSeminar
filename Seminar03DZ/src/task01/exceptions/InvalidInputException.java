package task01.exceptions;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String messege) {
        super(messege);
    }
}
