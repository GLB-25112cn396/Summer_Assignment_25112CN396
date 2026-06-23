import java.util.*;
public class p89
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter the string ");
      String str=sc.nextLine();
      int i,j;
      //First Non-repeating Character
      for(i=0;i<str.length();i++){
        int count =0;
        for(j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
        if(count==1){
            System.out.println("First non-repeating character: " + str.charAt(i));
            return;
        }
      }
      System.out.println("No non repeating character");

    }
}