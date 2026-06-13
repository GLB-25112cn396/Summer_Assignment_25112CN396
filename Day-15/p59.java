import java.util.*;
public class p59 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the array size");
            int n = sc.nextInt();

            System.out.println("Enter the array elements");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Enter the number for right rotation");
            int k = sc.nextInt();
            k = k % n; // k > n
            for (int i = 0; i < k; i++) {
                int temp = a[n - 1];
                for (int j = n - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                a[0] = temp;
            }

            System.out.println("Array after right rotation");
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
