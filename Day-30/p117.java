import java.util.Scanner;

public class p117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[100];
        int[] roll = new int[100];
        int[] marks = new int[100];

        int count = 0, choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Roll Number: ");
                    roll[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Student Record Added Successfully!");
                }

                case 2 -> {
                    if (count == 0) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\nRoll\tName\t\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(roll[i] + "\t" + name[i] + "\t\t" + marks[i]);
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == searchRoll) {
                            System.out.println("Student Found!");
                            System.out.println("Roll No: " + roll[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter Roll Number to Update Marks: ");
                    int updateRoll = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (roll[i] == updateRoll) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();
                            System.out.println("Marks Updated Successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                }

                case 5 -> {
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (roll[i] == deleteRoll) {
                            for (int j = i; j < count - 1; j++) {
                                roll[j] = roll[j + 1];
                                name[j] = name[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            count--;
                            System.out.println("Student Record Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                }

                case 6 -> System.out.println("Exiting Student Record System...");

                default -> System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}