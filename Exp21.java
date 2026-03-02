import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Exp21 {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("--Welcome to voting--");
        System.out.print("AGE->");
        age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("not eligible: Age was under 18 ");
            } else {
                System.out.println("You can vote");
            }

        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
