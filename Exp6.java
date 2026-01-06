//6.	Create a Student class with attributes (name, roll number, marks). Write methods to compute the grade and display details. Create objects in main() and demonstrate usage.
import java.util.Scanner;

class Student1 {
    String name;
    int roll;
    int marks;

    Student1(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void computeGrade() {
        if (marks >= 75)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: B");
        else if (marks >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
        computeGrade();
    }
}

public class Exp6 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            Student1 s = new Student1(name, roll, marks);
            s.display();

            System.out.print("\nAdd another student? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }
}
