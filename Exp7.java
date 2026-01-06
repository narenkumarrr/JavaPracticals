
//7. Implement a contact manager with fields (name, phone, email). Perform add, update, delete, and search operations.
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println(name + " | " + phone + " | " + email);
    }
}

public class Exp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact[] contacts = new Contact[100]; // fixed size array
        int count = 0;
        int choice;

        do {
            System.out.println("\n1.Add  2.Update  3.Delete  4.Search  5.Exit");
            choice = sc.nextInt();

            switch (choice) {

                // Add
                case 1:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Phone: ");
                    String phone = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();

                    contacts[count++] = new Contact(name, phone, email);
                    break;

                // Update
                case 2:
                    System.out.print("Enter name to update: ");
                    name = sc.next();
                    for (int i = 0; i < count; i++) {
                        if (contacts[i].name.equals(name)) {
                            System.out.print("New phone: ");
                            contacts[i].phone = sc.next();
                            System.out.print("New email: ");
                            contacts[i].email = sc.next();
                        }
                    }
                    break;

                // Delete
                case 3:
                    System.out.print("Enter name to delete: ");
                    name = sc.next();
                    for (int i = 0; i < count; i++) {
                        if (contacts[i].name.equals(name)) {
                            for (int j = i; j < count - 1; j++) {
                                contacts[j] = contacts[j + 1];
                            }
                            count--;
                            break;
                        }
                    }
                    break;

                // Search
                case 4:
                    System.out.print("Enter name to search: ");
                    name = sc.next();
                    for (int i = 0; i < count; i++) {
                        if (contacts[i].name.equals(name)) {
                            contacts[i].display();
                        }
                    }
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
