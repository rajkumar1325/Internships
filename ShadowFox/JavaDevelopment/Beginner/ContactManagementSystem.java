import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    public String name;
    public String phoneNumber;
    public String email;

    // Constructor for storing files.
    Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display contact details
    public void display() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email);
    }
}


public class ContactManager {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. EXIT");
            
            int option = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (option) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> updateContact();
                case 4 -> deleteContact();
                case 5 -> {return;}
                
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter his phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(name, phoneNumber, email));    //create a new contact object for each one.
        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available...");
            return;
        }
        System.out.println("\nContact List:");
        for (Contact c : contacts) {
            c.display();
        }
    }

    static void updateContact() {
        System.out.print("Enter Name to Update: ");
        String name = sc.nextLine();
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {  //checks for match in ArrayList ignoring case.
                System.out.print("Enter New Phone: ");
                c.phoneNumber = sc.nextLine();
                System.out.print("Enter New Email: ");
                c.email = sc.nextLine();
                System.out.println("........Contact updated Yah!.......");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    static void deleteContact() {
        System.out.print("Enter Name to Delete: ");
        String name = sc.nextLine();
        contacts.removeIf(c -> c.name.equalsIgnoreCase(name));
        System.out.println("Contact deleted (if found).");
    }
}
