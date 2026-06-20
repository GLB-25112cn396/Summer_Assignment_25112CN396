import java.util.Scanner;
public class p78
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }//SYMMETRIC MATRIX

        boolean flag = true;

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i][j] != a[j][i])
                {
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not a Symmetric Matrix");
    }
}