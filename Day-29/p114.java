import java.util.Scanner;

public class p114 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[100];
            int n, choice, i, sum ;
            System.out.print("Enter the number of elements: ");
            n = sc.nextInt();
            System.out.println("Enter array elements:");
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }   do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Display Array");
                System.out.println("2. Find Sum");
                System.out.println("3. Find Maximum");
                System.out.println("4. Find Minimum");
                System.out.println("5. Search Element");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Array Elements: ");
                        for (i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    
                    case 2 -> {
                        sum = 0;
                        for (i = 0; i < n; i++) {
                            sum += arr[i];
                        }
                        System.out.println("Sum = " + sum);
                    }
                    
                    case 3 -> {
                        int max = arr[0];
                        for (i = 1; i < n; i++) {
                            if (arr[i] > max)
                                max = arr[i];
                        }
                        System.out.println("Maximum = " + max);
                    }
                    
                    case 4 -> {
                        int min = arr[0];
                        for (i = 1; i < n; i++) {
                            if (arr[i] < min)
                                min = arr[i];
                        }
                        System.out.println("Minimum = " + min);
                    }
                    
                    case 5 -> {
                        System.out.print("Enter element to search: ");
                        int key = sc.nextInt();
                        boolean found = false;
                        
                        for (i = 0; i < n; i++) {
                            if (arr[i] == key) {
                                System.out.println("Element found at position " + (i + 1));
                                found = true;
                                break;
                            }
                        }
                        
                        if (!found) {
                            System.out.println("Element not found.");
                        }
                    }
                    
                    case 6 -> System.out.println("Exiting...");
                    
                    default -> System.out.println("Invalid choice!");
                }
                
            } while (choice != 6);
        }
    }
}