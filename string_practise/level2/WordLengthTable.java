import java.util.Scanner;

public class WordLengthTable {
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

    static int findLength(String s) {
        int count = 0;
        try {
            while (true) { s.charAt(count); count++; }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitManual(text);
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
