import java.util.*;
public class p91
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first string ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string ");
        String s2= sc.nextLine();
        //Checking for Anagram string
        if(s1.length()!=s2.length()){
            System.out.println("Strings are not anagram");//Two different words with same letters
        }
        int count=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
               if(s1.charAt(i)==s2.charAt(j)){
                count++;
                break;
                }
            }

        }
        if(count==s1.length()){
        System.out.println("Is anagram");
        }
        else{
            System.out.println("Is not anagram");
      
        }
    }
}