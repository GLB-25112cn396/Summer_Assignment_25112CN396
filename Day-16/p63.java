import java.util.*;
public class p63
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int n=sc.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("Enter the sum");//entering the sum
      int sum=sc.nextInt();
      System.out.println("The pairs with the given sum:");
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]+a[j]==sum){
                System.out.println(a[i] + " " + a[j]);//Displaying The pairs of the sum
            }
        }

      }
    }
}