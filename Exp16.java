interface Payable {
    double getPaymentAmount();

}

class Invoice implements Payable {
    int quantity;

    Invoice(int quantity) {
        this.quantity = quantity;
    }

    public double getPaymentAmount() {
        int amount = quantity * 100;
        return amount;
    }
}

class Salary implements Payable {
    int salary;

    Salary(int salary) {
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return salary;
    }
}

public class Exp16 {
    public static void main(String[] args) {
        Payable p1 = new Invoice(2);
        Payable p2 = new Salary(20000);
        System.out.println("Salary->" + p2.getPaymentAmount());
        System.out.println("Invoice->" + p1.getPaymentAmount());

    }
}
