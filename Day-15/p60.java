
import java.util.Scanner;

public class p60
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int temp;
        int j=0;
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for( int i=0;i<n;i++){
        if(a[i]!=0){//If the element is not Zero
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j++;
            }
        }
        System.out.println("The array after moving zeros to end\n");
        //Displaying array with zeros at end
        for( int i=0;i<n;i++) {
        System.out.println(+a[i]);
        }
        
    }
}