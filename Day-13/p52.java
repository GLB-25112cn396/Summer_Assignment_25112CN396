import java.util.*;
public class p52
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int ar1[]= new int[n];
        int counteven=0 ; int countodd=0;
        for (int i=0;i<n;i++){
        ar1[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if (ar1[j]%2==0)//Finding Even number and count them
            {
               counteven++;
            }
           else
            {
               countodd++;//Count odd terms
            }
        }
     System.out.println("The no. of the even terms are "+counteven);//Displaying no. of even terms
     System.out.println("The no. of the odd terms are "+countodd);//Displaying no. of odd terms
        
    }
}




 




    








































