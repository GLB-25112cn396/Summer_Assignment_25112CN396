import java.util.*;
public class p71
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,mid,strt,end ,loc=-1;
        System.out.println("Enter the arrray size");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //Binary Search
        System.out.println("Enter the item searched for ");
        int item=sc.nextInt();
        strt=0;
        end=n-1;
        mid=strt+(end-strt)/2;
        while(strt<=end && a[mid]!=item){
            mid=strt+(end-strt)/2;
            if(item>a[mid]){
                strt=mid+1;//Second half
            }
            else{
                end=mid-1;//First half
            }
        }
        if(item==a[mid]){ //Displaying the item location 
            System.out.println("Element " +item+ " is found  at position " +(mid+1));
        }
        else{
            if(loc!=-1){
                System.out.println("Search is unsuccesful");//If Item is not found
            }
        }
    }
}