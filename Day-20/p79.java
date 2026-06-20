import java.util.Scanner;
public class p79
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
         //Sum row wise
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++)
        {
            int sum = 0;

            for(int j = 0; j < c; j++)
            {
                sum += a[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
    }
}