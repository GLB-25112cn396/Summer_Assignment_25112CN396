import java.util.*;
public class p56
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //Finding Duplicates in an array
        System.out.println("The duplicate in array ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.println( +a[i]);//Displaying duplicates
                    break;
                }
            }
        }
    }
} 