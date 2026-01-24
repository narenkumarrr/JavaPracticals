interface Payable2 {
    void calculatePay();

}

class HourlyEmployee implements Payable2 {
    int hours;

    HourlyEmployee(int hours) {
        this.hours = hours;
    }

    public void calculatePay() {
        System.out.println("To pay->" + hours * 40);
    }
}

class SalariedEmployee implements Payable2 {
    int salary;

    SalariedEmployee(int salary) {
        this.salary = salary;
    }

    public void calculatePay() {
        System.out.println("Salary->" + salary);
    }
}

public class Exp17 {
    public static void main(String[] args) {
        Payable2 p1 = new HourlyEmployee(8);
        Payable2 p2 = new SalariedEmployee(40000);
        p1.calculatePay();
        p2.calculatePay();
    }
}
