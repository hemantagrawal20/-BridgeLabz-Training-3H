// Program to convert distance in feet to yards and miles
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        double distanceInFeet, distanceInYards, distanceInMiles;
        final int FEET_PER_YARD = 3;
        final int YARDS_PER_MILE = 1760;

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Conversion
        distanceInYards = distanceInFeet / FEET_PER_YARD;
        distanceInMiles = distanceInYards / YARDS_PER_MILE;

        // Output
        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles for the given " + distanceInFeet + " feet");

        input.close();
    }
}
