class BankAccount {

    // static variable (shared by all objects)
    static double interestRate = 5.0;

    // non-static variables (unique per object)
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // non-static method
    void display() {
        System.out.println(name + " | Balance: " + balance +
                " | Interest Rate: " + interestRate);
    }

    // static method
    static void changeRate(double rate) {
        interestRate = rate;
    }
}

public class Exp9 {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("Amit", 1000);
        BankAccount a2 = new BankAccount("Riya", 2000);

        a1.display();
        a2.display();

        // change static variable
        BankAccount.changeRate(6.5);

        a1.display();
        a2.display();
    }
}
