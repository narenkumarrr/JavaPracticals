import java.util.*;

@FunctionalInterface
interface Operation {
    int perform(int a, int b);
}

public class Exp19 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Operation sum = (a, b) -> a + b;
        Operation dif = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> {
            if (b == 0) {
                System.out.println("Division by zero not allowed");
                return 0;
            }
            return a / b;
        };

        while (true) {
            System.out.println("\n--- Select Operation ---");
            System.out.println("1. Sum");
            System.out.println("2. Difference");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            int op = sc.nextInt();

            if (op == 5) {
                System.out.println("Exiting program");
                break;
            }

            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Result = " + sum.perform(a, b));
                    break;

                case 2:
                    System.out.println("Result = " + dif.perform(a, b));
                    break;

                case 3:
                    System.out.println("Result = " + mul.perform(a, b));
                    break;

                case 4:
                    System.out.println("Result = " + div.perform(a, b));
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
