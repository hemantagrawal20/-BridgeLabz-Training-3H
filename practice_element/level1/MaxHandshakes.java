// Program to find the maximum number of handshakes among N students
import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        int numberOfStudents;
        int totalHandshakes;

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Formula: n*(n-1)/2
        totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of handshakes possible is " + totalHandshakes);

        input.close();
    }
}
