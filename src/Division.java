public class Division {
    public static double divide(double a, double b) {
        if (b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return (double) a / b;
    }
}
