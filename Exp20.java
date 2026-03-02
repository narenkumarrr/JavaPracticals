import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp20 {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("A->");
            a = sc.nextInt();
            System.out.print("B->");
            b = sc.nextInt();
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.print("division by zero");
        } catch (InputMismatchException e) {
            System.out.print("mismatched");
        }
        sc.close();
    }
}
