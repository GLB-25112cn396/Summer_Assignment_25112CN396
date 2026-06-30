import java.util.Scanner;

public class p120 {

    static int[] roll = new int[100];
    static String[] name = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    // Add Student
    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
        System.out.println("Student Added Successfully!");
    }

    // Display Students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\nRoll\tName\t\tMarks");
        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t\t" + marks[i]);
        }
    }

    // Search Student
    static void searchStudent() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("Student Found");
                System.out.println("Roll  : " + roll[i]);
                System.out.println("Name  : " + name[i]);
                System.out.println("Marks : " + marks[i]);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Update Marks
    static void updateMarks() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();
                System.out.println("Marks Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Delete Student
    static void deleteStudent() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                for (int j = i; j < count - 1; j++) {
                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchStudent();
                case 4 -> updateMarks();
                case 5 -> deleteStudent();
                case 6 -> System.out.println("Thank You!");
                default -> System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}