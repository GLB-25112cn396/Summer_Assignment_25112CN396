import java.util.*;
public class p51
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter array  elements");//Enter the array elements
        int ar1[]= new int[n];
        int min; int max;
        for(int i=0;i<n;i++){
        ar1[i] = sc.nextInt();
        }
        max = ar1[0];
        min = ar1[0];  
        for (int j=1;j<n;j++){
            if (ar1[j] > max)//For max element
            {
                max = ar1[j];
            }
            if (ar1[j] < min)//For min element
            {
                min = ar1[j];
            }
        }
     System.out.println("The largest element is "+max);
     System.out.println("The smallest element is "+min);
        
    }
}




 




    