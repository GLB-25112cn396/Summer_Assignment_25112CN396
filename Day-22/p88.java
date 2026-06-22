
import java.util.*;
public class p88 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		//  removal of spaces
		String result = str.replace(" ", "");
		System.out.println("String without spaces: " + result);
	}
}
