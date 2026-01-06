class Rectangle {
    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // One-parameter constructor (square)
    Rectangle(int side) {
        length = side;
        breadth = side;
    }

    // Two-parameter constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
}

public class Exp8 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Area (default): " + r1.area());
        System.out.println("Area (one parameter): " + r2.area());
        System.out.println("Area (two parameters): " + r3.area());
    }
}
