import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        int a, b, c;
        int result1, result2, result3, result4;

        // Input
        System.out.print("Enter value of a: ");
        a = input.nextInt();

        System.out.print("Enter value of b: ");
        b = input.nextInt();

        System.out.print("Enter value of c: ");
        c = input.nextInt();

        // Calculations with operator precedence
        // * and / and % have higher precedence than + and -
        result1 = a + b * c;    // b * c first, then add a
        result2 = a * b + c;    // a * b first, then add c
        result3 = c + a / b;    // a / b first, then add c
        result4 = a % b + c;    // a % b first, then add c

        // Output
        System.out.println("The results of Int Operations are: "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
