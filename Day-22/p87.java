import java.util.Scanner;

 public class p87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;

            if (ch == '0')
                continue;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                    str = str.substring(0, j) + '0' + str.substring(j + 1);
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}