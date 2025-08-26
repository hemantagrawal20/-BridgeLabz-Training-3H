import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            System.out.println(text.charAt(text.length())); // invalid
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }
}
