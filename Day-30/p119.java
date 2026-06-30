import java.util.Scanner;

public class p119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        double[] salary = new double[100];

        int count = 0, choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;
                    System.out.println("Employee Added Successfully!");
                }

                case 2 -> {
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nID\tName\t\tSalary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(empId[i] + "\t" + empName[i] + "\t\t" + salary[i]);
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("Employee Found!");
                            System.out.println("ID     : " + empId[i]);
                            System.out.println("Name   : " + empName[i]);
                            System.out.println("Salary : " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int updateId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (empId[i] == updateId) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Salary Updated Successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                }

                case 5 -> {
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (empId[i] == deleteId) {
                            for (int j = i; j < count - 1; j++) {
                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                salary[j] = salary[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Employee Deleted Successfully!");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                }

                case 6 -> System.out.println("Exiting Employee Management System...");

                default -> System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}