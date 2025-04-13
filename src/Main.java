/*
Name: Vedant Singh Thakur
PRN: 23070126144
Batch: B3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\n--- Calculator Menu ---");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square");
                System.out.println("6. Cube");
                System.out.println("7. Square Root");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting...");
                    break;
                }

                int a, b;
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Result: " + Addition.add(a, b));
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Result: " + Subtraction.subtract(a, b));
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Result: " + Multiplication.multiply(a, b));
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Result: " + Division.divide(a, b));
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        a = sc.nextInt();
                        System.out.println("Result: " + Square.square(a));
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        a = sc.nextInt();
                        System.out.println("Result: " + Cube.cube(a));
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        a = sc.nextInt();
                        System.out.println("Result: " + SquareRoot.squareRoot(a));
                        break;
                    default:
                        throw new InvalidMenuChoiceException("Invalid menu choice: " + choice);
                }
            }

        } catch (NegativeInputException | InvalidMenuChoiceException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Math Error: " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
