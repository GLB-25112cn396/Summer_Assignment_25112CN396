import java.util.*;
public class p55
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        int swap;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } //Second largest element in array
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        System.out.println("Second Largest element is " + arr[n-2]);//Displaying Second largest element
    }
}