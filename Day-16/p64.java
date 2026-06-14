import java.util.*;
public class p64
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The array without duplicates");
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {//Elements which are duplicates 
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(a[i]);//Displaying array without duplicates
            }
        }

    }
}