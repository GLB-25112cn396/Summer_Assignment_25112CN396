import java.util.*;
public class p70
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
        // Applying Insertion sorting
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){//Sorting in ascendiong order
                    swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;

                }
            }
        }
        System.out.println("Sorted array is equals to");//Displaying sorted array
        for(i=0;i<n;i++){
            System.out.println(a[i]  +" ");
        }
    }
}        