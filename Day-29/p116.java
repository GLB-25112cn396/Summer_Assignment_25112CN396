import java.util.Scanner;

public class p116 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] productName = new String[100];
            int[] quantity = new int[100];
            double[] price = new double[100];
            int count = 0, choice;
            do {
                System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Product");
                System.out.println("2. Display Products");
                System.out.println("3. Search Product");
                System.out.println("4. Update Quantity");
                System.out.println("5. Delete Product");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Product Name: ");
                        productName[count] = sc.nextLine();
                        
                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();
                        
                        System.out.print("Enter Price: ");
                        price[count] = sc.nextDouble();
                        
                        count++;
                        System.out.println("Product Added Successfully!");
                    }
                    
                    case 2 -> {
                        if (count == 0) {
                            System.out.println("No products available.");
                        } else {
                            System.out.println("\nProduct\t\tQuantity\tPrice");
                            for (int i = 0; i < count; i++) {
                                System.out.println(productName[i] + "\t\t" +
                                        quantity[i] + "\t\t" + price[i]);
                            }
                        }
                    }
                    
                    case 3 -> {
                        System.out.print("Enter Product Name to Search: ");
                        String search = sc.nextLine();
                        boolean found = false;
                        
                        for (int i = 0; i < count; i++) {
                            if (productName[i].equalsIgnoreCase(search)) {
                                System.out.println("Product Found!");
                                System.out.println("Name: " + productName[i]);
                                System.out.println("Quantity: " + quantity[i]);
                                System.out.println("Price: " + price[i]);
                                found = true;
                                break;
                            }
                        }
                        
                        if (!found)
                            System.out.println("Product not found.");
                    }
                    
                    case 4 -> {
                        System.out.print("Enter Product Name to Update: ");
                        String update = sc.nextLine();
                        boolean found = false;
                        for (int i = 0; i < count; i++) {
                            if (productName[i].equalsIgnoreCase(update)) {
                                System.out.print("Enter New Quantity: ");
                                quantity[i] = sc.nextInt();
                                System.out.println("Quantity Updated Successfully!");
                                found = true;
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Product not found.");
                    }
                    
                    case 5 -> {
                        System.out.print("Enter Product Name to Delete: ");
                        String delete = sc.nextLine();
                        boolean found = false;
                        for (int i = 0; i < count; i++) {
                            if (productName[i].equalsIgnoreCase(delete)) {
                                for (int j = i; j < count - 1; j++) {
                                    productName[j] = productName[j + 1];
                                    quantity[j] = quantity[j + 1];
                                    price[j] = price[j + 1];
                                }
                                count--;
                                System.out.println("Product Deleted Successfully!");
                                found = true;
                                break;
                            }
                        }
                        if (!found)
                            System.out.println("Product not found.");
                    }
                    
                    case 6 -> System.out.println("Exiting Inventory Management System...");
                    
                    default -> System.out.println("Invalid Choice!");
                }
                
            } while (choice != 6);
        }
    }
}