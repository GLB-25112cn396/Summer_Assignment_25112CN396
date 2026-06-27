import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;
    double hra;
    double da;
    double deduction;
    double netSalary;
}

public class p107 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Calculate Salary");
            System.out.println("4. Search Employee");
            System.out.println("5. Update Basic Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    emp[count] = new Employee();

                    System.out.print("Enter Employee ID: ");
                    emp[count].empId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    emp[count].name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    emp[count].basicSalary = sc.nextDouble();

                    System.out.print("Enter HRA: ");
                    emp[count].hra = sc.nextDouble();

                    System.out.print("Enter DA: ");
                    emp[count].da = sc.nextDouble();

                    System.out.print("Enter Deduction: ");
                    emp[count].deduction = sc.nextDouble();

                    System.out.println("Employee Added Successfully!");
                    count++;
                    break;

                case 2:
                    if(count == 0) {
                        System.out.println("No Employee Records Found!");
                    } else {
                        for(int i = 0; i < count; i++) {
                            System.out.println("\n---------------------------");
                            System.out.println("Employee ID : " + emp[i].empId);
                            System.out.println("Name        : " + emp[i].name);
                            System.out.println("Basic Salary: " + emp[i].basicSalary);
                            System.out.println("HRA         : " + emp[i].hra);
                            System.out.println("DA          : " + emp[i].da);
                            System.out.println("Deduction   : " + emp[i].deduction);
                            System.out.println("Net Salary  : " + emp[i].netSalary);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < count; i++) {
                        if(emp[i].empId == id) {

                            emp[i].netSalary = emp[i].basicSalary +
                                               emp[i].hra +
                                               emp[i].da -
                                               emp[i].deduction;

                            System.out.println("Net Salary = " + emp[i].netSalary);
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                        System.out.println("Employee Not Found!");

                    break;

                case 4:
                    System.out.print("Enter Employee ID to Search: ");
                    id = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++) {

                        if(emp[i].empId == id) {
                            System.out.println("\nEmployee Found");
                            System.out.println("Name: " + emp[i].name);
                            System.out.println("Basic Salary: " + emp[i].basicSalary);
                            System.out.println("Net Salary: " + emp[i].netSalary);
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                        System.out.println("Employee Not Found!");

                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++) {

                        if(emp[i].empId == id) {

                            System.out.print("Enter New Basic Salary: ");
                            emp[i].basicSalary = sc.nextDouble();

                            System.out.println("Salary Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                        System.out.println("Employee Not Found!");

                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 6);

    }
}