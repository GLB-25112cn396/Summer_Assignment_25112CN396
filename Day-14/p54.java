import java.util.*;
public class p54
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int n=sc.nextInt();
    System.out.println("Enter the array elements");
    int arr[]=new int[n];
    int count=0;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the item to be counted");// Entering Item which has to be counted
    int item=sc.nextInt();
    for(int j=0;j<n;j++){
    if(arr[j]==item){ //Frequency of an Elemnet
        count++;
        }
    }
     System.out.println("The item " +item+ " is found  " +count+ " times");//Displaying count of an item
    }   
}