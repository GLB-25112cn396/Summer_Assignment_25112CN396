import java.util.*;
public class p83
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, consonents = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonents++;
                }
            }
        }

        System.out.println("Vowels count: " + vowels);
        System.out.println("Consonents count: " + consonents);
    }
}