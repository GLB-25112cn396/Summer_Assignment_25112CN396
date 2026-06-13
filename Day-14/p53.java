import java.util.*;
public class p53
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int found =0;
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();

        }
        System.out.println("Enter the item to be searched");//Required item
        int item =sc.nextInt();
        //Linear Search
        for(int i=0;i<n;i++){
        if(item==ar[i]){
            System.out.println("The item " +item+ " is found at the location: " +(i+1));//Location of the item found
            System.out.println("The item " +item+ " is found at index: " +i);//Index of Item
            found=1;
            break;
            }
        }
        if (found!=1) {
        System.out.println("Item not found");//If item not present
    
        }

    }
}



