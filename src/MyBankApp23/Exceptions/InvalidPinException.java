package MyBankApp23.Exceptions;

public class InvalidPinException extends RuntimeException {

    public InvalidPinException(String message){
        super(message);
    }
    public InvalidPinException(Throwable cause){
        super(cause);
    }
    public InvalidPinException(String message, Throwable cause){
        super(message, cause);
    }

}
