public class SquareRoot {
    public static double squareRoot(double a) {
        if (a<0){
            throw new ArithmeticException("SquareRoot called with a negative value");
        }
        return Math.sqrt(a);
    }
}
