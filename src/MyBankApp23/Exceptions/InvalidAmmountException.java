package MyBankApp23.Exceptions;

public class InvalidAmmountException extends RuntimeException {
    public InvalidAmmountException(String message){
        super(message);
    }

    public InvalidAmmountException(Throwable cause){
        super(cause);
    }

    public InvalidAmmountException(String message,Throwable cause){
        super(message, cause);
    }
}
