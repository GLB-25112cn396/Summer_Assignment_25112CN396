import java.util.Scanner;

class Employee {
    int empId;
    String name;
    String department;
    double salary;
}

public class p106
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    employees[count] = new Employee();

                    System.out.print("Enter Employee ID: ");
                    employees[count].empId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    employees[count].name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    employees[count].department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    employees[count].salary = sc.nextDouble();

                    count++;
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found!");
                    } else {
                        System.out.println("\nEmployee Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("----------------------------");
                            System.out.println("Employee ID : " + employees[i].empId);
                            System.out.println("Name        : " + employees[i].name);
                            System.out.println("Department  : " + employees[i].department);
                            System.out.println("Salary      : " + employees[i].salary);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].empId == searchId) {
                            System.out.println("\nEmployee Found:");
                            System.out.println("Name       : " + employees[i].name);
                            System.out.println("Department : " + employees[i].department);
                            System.out.println("Salary     : " + employees[i].salary);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].empId == updateId) {

                            System.out.print("Enter New Name: ");
                            employees[i].name = sc.nextLine();

                            System.out.print("Enter New Department: ");
                            employees[i].department = sc.nextLine();

                            System.out.print("Enter New Salary: ");
                            employees[i].salary = sc.nextDouble();

                            System.out.println("Employee Record Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].empId == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                employees[j] = employees[j + 1];
                            }

                            employees[count - 1] = null;
                            count--;

                            System.out.println("Employee Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 6);

    }
}