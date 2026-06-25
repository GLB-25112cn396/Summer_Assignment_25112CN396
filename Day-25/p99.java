import java.util.*;

public class p99 {
    public static void main(String args[]) {
        String names[] = {"Rakhi", "Akhil", "Puneet", "Neha", "Vikrant"};
        //Sorting names alphabetically
        Arrays.sort(names);

        System.out.println("Names in alphabetical order:");
        for(String name : names) {
            System.out.println(name);
        }
    }
}