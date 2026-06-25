import java.util.*;

public class p98 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first string ");
        String s1 = sc.nextLine();
        System.out.println("Enter  the second string ");
        String s2 = sc.nextLine();

        System.out.print("Common characters: ");

        for(int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);

            for(int j = 0; j < s2.length(); j++) {
                if(ch1 == s2.charAt(j)) {
                    System.out.print(ch1 + " ");
                    break;
                }
            }
        }
    }
}