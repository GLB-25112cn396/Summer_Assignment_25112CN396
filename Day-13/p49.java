import java.util.*;
public class p49
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");//Input the array Size and elements
        int n = sc.nextInt();
        int ar[]= new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++){
        ar[i] = sc.nextInt();
        }
        System.out.println("Array elements are:\n");
        for(int i=0;i<n;i++){
         System.out.println(ar[i]+" ");//Displaying the array elements
        }
    }
}