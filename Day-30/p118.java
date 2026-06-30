import java.util.Scanner;

public class p118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bookName = new String[100];
        String[] author = new String[100];
        int[] bookId = new int[100];

        int count = 0, choice;

        do {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author[count] = sc.nextLine();

                    count++;
                    System.out.println("Book Added Successfully!");
                }

                case 2 -> {
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nID\tBook Name\tAuthor");
                        for (int i = 0; i < count; i++) {
                            System.out.println(bookId[i] + "\t" + bookName[i] + "\t\t" + author[i]);
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == searchId) {
                            System.out.println("Book Found!");
                            System.out.println("Book ID   : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author    : " + author[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter Book ID to Delete: ");
                    int deleteId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == deleteId) {
                            for (int j = i; j < count - 1; j++) {
                                bookId[j] = bookId[j + 1];
                                bookName[j] = bookName[j + 1];
                                author[j] = author[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Book Deleted Successfully!");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                }

                case 5 -> System.out.println("Exiting Mini Library System...");

                default -> System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}