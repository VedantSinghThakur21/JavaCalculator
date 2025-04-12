public class SquareRoot {
    public static double squareRoot(double a) {
        if (a<0){
            throw new NegativeInputException("Cannot Calculate Square Root of a negative value");
        }
        return Math.sqrt(a);
    }
}
