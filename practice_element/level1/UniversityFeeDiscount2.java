// Program to calculate final discounted fee
import java.util.Scanner;

public class UniversityFeeDiscount {
    public static void main(String[] args) {
        // Variables
        double fee, discountPercent, discountAmount, finalFee;

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter student fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter university discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculations
        discountAmount = (fee * discountPercent) / 100;
        finalFee = fee - discountAmount;

        // Output
        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
