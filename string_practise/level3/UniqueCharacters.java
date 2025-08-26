import java.util.Scanner;

public class UniqueCharacters {
    // find length without using length()
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int n = findLength(text);
        char[] unique = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (unique[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[k++] = c;
            }
        }

        System.out.print("Unique characters: ");
        for (int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
