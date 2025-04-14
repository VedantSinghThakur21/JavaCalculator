// Class to calculate square root of a number
public class SquareRoot {
    // Throws a custom exception if input is negative
    public static double squareRoot(double a) {
        if (a<0){
            throw new NegativeInputException("Cannot Calculate Square Root of a negative value");
        }
        return Math.sqrt(a);
    }
}
