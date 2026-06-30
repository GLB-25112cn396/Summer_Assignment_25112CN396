import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {

            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    manager.addContact(new Contact(name, phone, email));
                }

                case 2 -> manager.displayContacts();

                case 3 -> {
                    System.out.print("Enter Name to Search: ");
                    String searchName = sc.nextLine();
                    manager.searchContact(searchName);
                }

                case 4 -> {
                    System.out.print("Enter Name to Delete: ");
                    String deleteName = sc.nextLine();
                    manager.deleteContact(deleteName);
                }

                case 5 -> {
                    System.out.println("Thank you for using the Contact Management System.");
                    sc.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Contact {
    private final String name;
    private final String phone;
    private final String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

class ContactManager {
    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\nContacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        Contact toRemove = null;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                toRemove = contact;
                break;
            }
        }

        if (toRemove == null) {
            System.out.println("Contact not found.");
        } else {
            contacts.remove(toRemove);
            System.out.println("Contact deleted successfully.");
        }
    }
}
