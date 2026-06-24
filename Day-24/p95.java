import java.util.*;
public class p95 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        String longest = words[0];
        //longest word in a sentence
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest word will be: " + longest);
    }
}