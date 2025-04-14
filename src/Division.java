// Class to perform division operation
public class Division {
    // Static method to divide two integers and return the result as double
    public static double divide(double a, double b) {
        if (b==0){
            // Throw arithmetic exception if denominator is zero
            throw new ArithmeticException("Divide by zero");
        }
        return (double) a / b;
    }
}
