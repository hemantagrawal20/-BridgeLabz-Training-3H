import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        double perimeter, side;

        // Input
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculation
        side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}
