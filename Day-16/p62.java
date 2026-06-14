import java.util.*;
public class p62
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[] = new int[n];
        int count;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxfreq = 0;
        int maxelement = a[0];
        for(int i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){//counting the Maximum frquency element
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>maxfreq){
                maxfreq=count;
                maxelement=a[i];
            }
        }
        System.out.println("Maximum frequency element " + maxelement);//Displaying max frequency
        System.out.println("Frequency is " + maxfreq);//Displaying frequecy of max element
        
    }
}