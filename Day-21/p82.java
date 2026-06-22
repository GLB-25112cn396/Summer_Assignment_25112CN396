
import java.util.*;
public class p82
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str =sc.nextLine();
    String rev =" ";
    for(int i=str.length()-1;i>=0;i--){
      rev = rev + str.charAt(i);
      }
    System.out.println("Reverse of the string = " + rev);
    }
}