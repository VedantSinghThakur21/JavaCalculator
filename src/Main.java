/*
Name: Vedant Singh Thakur
PRN: 23070126144
Batch: B3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner Object to take User Input
        Scanner sc = new Scanner(System.in);

        try {
            // Infinite Loop for Menu Driven Interaction
            while (true) {
                //Display Interaction Menu
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
                // User Input for Operation Choice
                int choice = sc.nextInt();

                //Exit Condition
                if (choice == 0) {
                    System.out.println("Exiting...");
                    break;
                }

                // Variables to hold Input
                int a, b;
                // Perform Operation based on User Choice
                switch (choice) {
                    case 1: //Addition
                        System.out.print("Enter two numbers: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Result: " + Addition.add(a, b));
                        break;
                    case 2: // Subtraction
                        System.out.print("Enter two numbers: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Result: " + Subtraction.subtract(a, b));
                        break;
                    case 3: // Multiplication
                        System.out.print("Enter two numbers: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Result: " + Multiplication.multiply(a, b));
                        break;
                    case 4: // Division with zero check
                        System.out.print("Enter two numbers: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Result: " + Division.divide(a, b));
                        break;
                    case 5: // Square of a Number ( can throw exception for negative input)
                        System.out.print("Enter a number: ");
                        a = sc.nextInt();
                        System.out.println("Result: " + Square.square(a));
                        break;
                    case 6: // Cube of a Number
                        System.out.print("Enter a number: ");
                        a = sc.nextInt();
                        System.out.println("Result: " + Cube.cube(a));
                        break;
                    case 7: // Square root of a Number
                        System.out.print("Enter a number: ");
                        a = sc.nextInt();
                        System.out.println("Result: " + SquareRoot.squareRoot(a));
                        break;
                    default:
                        // Custom Exception if the menu choice by the user is invalid
                        throw new InvalidMenuChoiceException("Invalid menu choice: " + choice);
                }
            }

        } catch (NegativeInputException | InvalidMenuChoiceException e) {
            // Handling Customised Exceptions
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (ArithmeticException ae) {
            //Handling certain Mathematical errors
            System.out.println("Math Error: " + ae.getMessage());
        } catch (Exception e) {
            // Catching any unexpected exceptions
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
