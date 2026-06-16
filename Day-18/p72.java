import java.util.*;
public class p72
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,swap;
        System.out.println("Enter the arrray size");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // Applying Bubble sorting
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){ //Sorting in Decreasing order
                    swap=a[j];
                    a[j]=a[j+1];
                    a[j+1]=swap;
                }
            }
        }
        System.out.println("Sorted array is equals to");
        for(i=0;i<n;i++){
        System.out.println(a[i] +" ");// Displaying Sorted Array
        }
    }
}        
        
    