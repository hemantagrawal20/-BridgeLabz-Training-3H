// Program to calculate total purchase price
import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        double unitPrice, quantity, totalPrice;

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the unit price (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = input.nextDouble();

        // Calculation
        totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
