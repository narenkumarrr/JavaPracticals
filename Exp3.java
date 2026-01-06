
//3.	Implement an ATM menu (deposit, withdraw, check balance) using a loop and switch-case.
import java.util.Scanner;

public class Exp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double balance = 1000;

        do {
            System.out.println("1.Deposit  2.Withdraw  3.Check Balance  4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    balance += sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    if (amt <= balance)
                        balance -= amt;
                    else
                        System.out.println("Insufficient balance");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;
            }
        } while (choice != 4);
        sc.close();
    }

}
