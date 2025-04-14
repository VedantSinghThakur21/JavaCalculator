// Custom exception class for handling negative inputs in square root
public class NegativeInputException extends RuntimeException {
    public NegativeInputException(String message) {

        super(message); // Pass message to Exception superclass
    }
}
