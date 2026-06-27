import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String course;
}

public class p105
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    students[count] = new Student();

                    System.out.print("Enter Roll Number: ");
                    students[count].rollNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    students[count].name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    students[count].age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    students[count].course = sc.nextLine();

                    count++;
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found!");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("---------------------------");
                            System.out.println("Roll No : " + students[i].rollNo);
                            System.out.println("Name    : " + students[i].name);
                            System.out.println("Age     : " + students[i].age);
                            System.out.println("Course  : " + students[i].course);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == searchRoll) {
                            System.out.println("Student Found:");
                            System.out.println("Name: " + students[i].name);
                            System.out.println("Age: " + students[i].age);
                            System.out.println("Course: " + students[i].course);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Update: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == updateRoll) {

                            System.out.print("Enter New Name: ");
                            students[i].name = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            students[i].age = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter New Course: ");
                            students[i].course = sc.nextLine();

                            System.out.println("Record Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == deleteRoll) {

                            for (int j = i; j < count - 1; j++) {
                                students[j] = students[j + 1];
                            }

                            students[count - 1] = null;
                            count--;

                            System.out.println("Record Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

    }
}