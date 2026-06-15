import java.util.*;
public class p66
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,k=0;
        boolean flag;
        int a[]=new int[100];
        int b[]=new int[100];
        int u[]=new int[200];
        System.out.println("Enter the size of array a");
        n=sc.nextInt();
        System.out.println("Enter the array a elements:");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array b");
        m=sc.nextInt();
        System.out.println("Enter the array b elements:");
        for( i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            u[k++]=a[i];//Copy first array
        }
        for(i=0;i<m;i++){
            flag=false;
            for(j=0;j<k;j++){
                if(b[i]==u[j]){//checking with  every element of array b with union
                    flag=true;
                    break;
                }
            }
            if(!flag){
                u[k++]=b[i];//If the element is not already present in the union array 
            }
        }
        System.out.println("Union of arrays");
        for(i=0;i<k;i++){
            System.out.println(u[i] + " ");//Displaying The Union of arrays
        }    
    }
}        