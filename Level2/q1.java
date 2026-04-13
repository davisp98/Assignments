import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Take floating point inputs from the user
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();

        // Perform the arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print the result matching the requested O/P format
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        
        // Close the scanner to prevent resource leaks
        input.close();
    }
}