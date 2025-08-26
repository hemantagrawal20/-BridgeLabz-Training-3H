import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = "";
        for (int i = start; i < end; i++) sub1 += text.charAt(i);

        String sub2 = text.substring(start, end);

        System.out.println("Using charAt(): " + sub1);
        System.out.println("Using substring(): " + sub2);
        System.out.println("Are same? " + sub1.equals(sub2));
    }
}
