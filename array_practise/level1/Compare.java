import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Checking conditions
        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are Equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than last");
        } else {
            System.out.println("First element is Less than last");
        }
    }
}
