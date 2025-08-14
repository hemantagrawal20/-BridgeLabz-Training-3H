// Program to perform basic arithmetic operations on two numbers
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Variables
        double number1, number2, addition, subtraction, multiplication, division;

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        // Calculations
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;

        // Output
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        input.close();
    }
}
