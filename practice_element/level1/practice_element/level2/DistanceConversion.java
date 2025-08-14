import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        double distanceFeet, distanceYards, distanceMiles;

        // Input
        System.out.print("Enter distance in feet: ");
        distanceFeet = input.nextDouble();

        // Calculations
        distanceYards = distanceFeet / 3;
        distanceMiles = distanceYards / 1760;

        // Output
        System.out.println("The distance in yards is " + distanceYards + " while the distance in miles is " + distanceMiles);

        input.close();
    }
}
