import java.util.Scanner;

public class SplitWords {
    static String[] splitManual(String text) {
        int spaceCount = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') spaceCount++;
        String[] words = new String[spaceCount];

        int start = 0, index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] w1 = splitManual(text);
        String[] w2 = text.split(" ");

        boolean same = true;
        if (w1.length != w2.length) same = false;
        else {
            for (int i = 0; i < w1.length; i++)
                if (!w1[i].equals(w2[i])) same = false;
        }

        System.out.println("Manual split:");
        for (String w : w1) System.out.print(w + " ");
        System.out.println("\nBuilt-in split:");
        for (String w : w2) System.out.print(w + " ");
        System.out.println("\nSame? " + same);
    }
}
