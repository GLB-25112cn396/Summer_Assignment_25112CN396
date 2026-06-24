import java.util.*;
public class p93
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=sc.nextLine();
        System.out.println("Enter the second string");
        String s2=sc.nextLine();
        //STRING ROTATION if s1+s1 conatins s2 as a substring
        if ((s1.length() == s2.length()) && (s1 + s1).contains(s2)) {
            System.out.println("It has string rotation");
        } else {
            System.out.println("It does not have string rotation");
        }
    }
}