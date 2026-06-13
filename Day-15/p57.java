import java.util.*;
public class p57
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int temp;
        System.out.println("Enter the arrray elements");//Enter the array
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i] =sc.nextInt();
        } //Reversed array
        for(int i=0;i<n/2;i++){
            temp =a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        System.out.println("Reversed array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(+a[i]);//Displaying the reversed aarry
        }


    }
}