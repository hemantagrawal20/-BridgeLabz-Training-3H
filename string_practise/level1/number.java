import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            int num = Integer.parseInt(text); // error if not number
            System.out.println("Number = " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled: " + e);
        }
    }
}
