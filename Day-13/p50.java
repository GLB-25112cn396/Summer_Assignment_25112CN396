import java.util.*;
public class p50
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n =sc.nextInt();
        int ar1[]= new int[n];
        System.out.println("Enter the array elements");
        int sum=0;
        for(int i=0;i<n;i++){
        ar1[i] = sc.nextInt();
        } //Sum and average of elements of array
        for(int j=0;j<n;j++){
            sum += ar1[j];
        }
        double avg = sum/n;
        System.out.println("The sum of the array is :" +sum);
        System.out.println("The average of the array is :" +avg);
    }
}




 