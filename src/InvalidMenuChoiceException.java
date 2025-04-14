// Custom exception class for invalid choices in calculator menu
public class InvalidMenuChoiceException extends RuntimeException {
    public InvalidMenuChoiceException(String message) {
        super(message); // Pass message to Exception superclass
    }
}
