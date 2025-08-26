import java.util.Scanner;

public class StringLengthDemo {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Length (manual): " + findLength(text));
        System.out.println("Length (built-in): " + text.length());
    }
}
