import java.util.*;
public class p94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String compressed = "";
        int count = 1;
        //COMPRESSED STRING
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed += str.charAt(i) + "" + count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + compressed);
    }
}