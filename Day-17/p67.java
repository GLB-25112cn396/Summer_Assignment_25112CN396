import java.util.*;
public class p67
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n,m,i,j;
        int a[]=new int[100];
        int b[]=new int[100];
        System.out.println("Enter the size of array a");
        n=sc.nextInt();
        System.out.println("Enter the array a  elements:");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array b");
        m=sc.nextInt();
        System.out.println("Enter the array b elements:");
        for( i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("Intersection elements are");
        for( i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(a[i]==b[j]){//If array  a elements is equal to the array b
                    System.out.println(a[i] +" ");//Displaying  intersected array 
                    break;
                }
            }
        }
        
    
        

       
    }
}