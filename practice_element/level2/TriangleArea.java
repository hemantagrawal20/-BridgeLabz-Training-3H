import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        double baseCm, heightCm, areaCm, areaInches;
        final double CM_PER_INCH = 2.54;

        // Input
        System.out.print("Enter base in cm: ");
        baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        // Calculations
        areaCm = 0.5 * baseCm * heightCm;
        areaInches = areaCm / (CM_PER_INCH * CM_PER_INCH);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);

        input.close();
    }
}
