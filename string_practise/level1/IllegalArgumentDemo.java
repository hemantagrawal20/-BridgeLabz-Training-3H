import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            System.out.println(text.substring(5, 2)); // invalid
        } catch (IllegalArgumentException e) {
            System.out.println("Handled: " + e);
        }
    }
}
