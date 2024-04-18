// Import the necessary package for user input
// Devon Villalona COP3330.CRN12565 9/17/2023
import java.util.Scanner;

/**
 * The DivisionApp class provides a program that prompts the user
 * to enter two integers and displays the result of their division.
 * If the user attempts to divide by zero, an exception is caught
 * and an appropriate message is displayed.
 */
public class DivisionApp {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.println("Enter the first integer (num1):");
        int num1 = scanner.nextInt();

        // Prompt the user for the second number
        System.out.println("Enter the second integer (num2):");
        int num2 = scanner.nextInt();

        try {
            // Attempt to divide the two numbers and store the result as a double
            double result = (double) num1 / num2;

            // Display the result, formatted to two decimal places
            System.out.printf("%d / %d = %.2f%n", num1, num2, result);
        } catch (ArithmeticException e) {
            // If an ArithmeticException (likely divide by zero) occurs, display its message
            System.out.println(e.getMessage());
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}



