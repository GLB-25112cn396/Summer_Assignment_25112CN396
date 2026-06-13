import java.util.*;
public class p58
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number for left rotation");//Enter the value of k for left rotation
        int k=sc.nextInt();
        k=k%n; //k>n
        for(int i=0;i<k;i++){
            int temp =a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
        System.out.println("Array after left rotation");//Displaying array after left rotation
        for(int i=0;i<n;i++){
            System.out.println(+a[i]);
        }
    }
}