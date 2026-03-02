class InsufficientFundException extends Exception {
    InsufficientFundException(String msg) {
        super(msg);
    }
}

class BankAccount22 {
    int balance;

    BankAccount22(int balance) {
        this.balance = balance;
    }

    void deposit(int x) {
        balance = balance + x;
        System.out.println("Deposited: $" + x);
    }

    void withdraw(int x) throws InsufficientFundException {
        if (balance < x) {
            // This 'throws' the error to the catch block
            throw new InsufficientFundException("Shortfall: $" + (x - balance));
        }
        balance = balance - x;
        System.out.println("$" + x + " Withdrawn successfully.");
    }

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class Exp22 {
    // This main method is the entry point. Without this, the code won't run.
    public static void main(String[] args) {
        BankAccount22 b1 = new BankAccount22(2000);

        try {
            b1.checkBalance();
            b1.deposit(500);

            System.out.println("Attempting to withdraw $3000...");
            b1.withdraw(3000); // This will trigger the exception

        } catch (InsufficientFundException e) {
            // This handles the error so the program doesn't crash
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            // This runs regardless of whether an error happened or not
            System.out.println("--- Final Statement ---");
            b1.checkBalance();
        }
    }
}