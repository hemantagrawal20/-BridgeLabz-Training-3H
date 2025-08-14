// Program to calculate area of a triangle in square inches and square centimeters
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double base, height, areaInInches, areaInCm;
        final double CM_PER_INCH = 2.54;

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter base in inches: ");
        base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        // Area in square inches
        areaInInches = 0.5 * base * height;

        // Convert to square centimeters
        areaInCm = areaInInches * CM_PER_INCH * CM_PER_INCH;

        // Output
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");

        input.close();
    }
}
