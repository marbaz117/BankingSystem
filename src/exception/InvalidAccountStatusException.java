package exception;

public class InvalidAccountStatusException extends Exception{
    public InvalidAccountStatusException(String message){
        super(message);
    }
}
