abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    int rad;

    Circle(int rad) {
        this.rad = rad;
    }

    void area() {
        double area = 3.14 * rad * rad;
        System.out.println("Area of Circle is " + area);
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        double area = (base * height) / 2;
        System.out.println("Area of Triangle is " + area);
    }
}

public class Exp14 {
    public static void main(String[] args) {
        Shape c = new Circle(3);
        Shape t = new Triangle(2, 3);
        c.area();
        t.area();
    }
}
