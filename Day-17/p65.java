import java.util.*;
public class p65
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array a");
        int n=sc.nextInt();
        System.out.println("Enter the size of array b");
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[m+n];
        System.out.println("Enter the array a elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            c[i]=a[i];//Copying array a into array c
        }
        System.out.println("Enter the array b elements:");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            c[n+i]=b[i];//Copying array b into array c after array a
        }
        System.out.println("Merged array is:");
        for(int i=0;i<n+m;i++){
            System.out.print(c[i] + " ");//Displaying Merged array
        }
        System.out.println();
    }
}