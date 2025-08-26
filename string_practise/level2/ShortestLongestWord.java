import java.util.Scanner;

public class ShortestLongestWord {
    static String[] splitManual(String text) {
        return text.split(" ");
    }

    static int findLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitManual(text);
        String shortest = words[0], longest = words[0];

        for (String w : words) {
            if (findLength(w) < findLength(shortest)) shortest = w;
            if (findLength(w) > findLength(longest)) longest = w;
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
