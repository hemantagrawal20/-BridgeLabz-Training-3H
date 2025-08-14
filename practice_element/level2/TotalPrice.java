import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        double unitPrice, totalPrice;
        int quantity;

        // Input
        System.out.print("Enter unit price (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Calculation
        totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice 
                + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
