// Program to convert kilometers to miles
import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        // Variables
        double km, miles;
        final double MILE_CONVERSION_FACTOR = 1.6;

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Conversion
        miles = km / MILE_CONVERSION_FACTOR;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
