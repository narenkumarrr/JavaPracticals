abstract class Vehicle {
    int days;

    Vehicle(int days) {
        this.days = days;
    }

    abstract void calculateRent();
}

class Bike extends Vehicle {
    Bike(int days) {
        super(days);
    }

    void calculateRent() {
        int rent = days * 500;
        System.out.println("Total->" + rent);
    }
}

class Car extends Vehicle {
    Car(int days) {
        super(days);
    }

    void calculateRent() {
        int rent = days * 2000;
        System.out.println("Total->" + rent);
    }
}

public class Exp15 {
    public static void main(String[] args) {
        Vehicle c = new Car(10);
        Vehicle b = new Bike(2);
        c.calculateRent();
        b.calculateRent();
    }
}
