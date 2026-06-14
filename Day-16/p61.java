import java.util.*;
public class p61
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int sum=0;
        int missing;
        int expected;
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){//Calculating Missing Number in an array
            sum+=a[i];
        }
        expected =n*(n+1)/2;
        missing= expected-sum;
        System.out.println("Missing no. is " +missing);//Printing the missing number
    }
         
}
