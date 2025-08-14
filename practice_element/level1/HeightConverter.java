// Program to convert height in cm to feet and inches
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Variables
        double heightCm;
        final double CM_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Conversion
        double totalInches = heightCm / CM_PER_INCH;
        int feet = (int) (totalInches / INCHES_PER_FOOT);
        double inches = totalInches % INCHES_PER_FOOT;

        // Output
        System.out.println("Your height in cm is " + heightCm + 
                ", while in feet is " + feet + " and inches is " + inches);

        input.close();
    }
}
