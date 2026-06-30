import java.util.Scanner;

public class p115 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            
            int choice;
            
            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Display String");
                System.out.println("2. Find Length");
                System.out.println("3. Convert to Uppercase");
                System.out.println("4. Convert to Lowercase");
                System.out.println("5. Reverse String");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> System.out.println("String: " + str);
                    
                    case 2 -> System.out.println("Length: " + str.length());
                    
                    case 3 -> System.out.println("Uppercase: " + str.toUpperCase());
                    
                    case 4 -> System.out.println("Lowercase: " + str.toLowerCase());
                    
                    case 5 -> {
                        String reverse = "";
                        for (int i = str.length() - 1; i >= 0; i--) {
                            reverse += str.charAt(i);
                        }
                        System.out.println("Reversed String: " + reverse);
                    }

                    case 6 -> System.out.println("Exiting...");
                    
                    default -> System.out.println("Invalid choice!");
                }
                
            } while (choice != 6);
        }
    }
}