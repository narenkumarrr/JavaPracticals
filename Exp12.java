class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void calculateResult() {
        if (marks < 33) {
            System.out.println(name + "has failed");
        } else {
            System.out.println(name + "has passed!!");
        }
    }
}

class Undergraduate extends Student {
    Undergraduate(String name, int marks) {
        super(name, marks);
    }

    void calculateResult() {
        if (marks < 45) {
            System.out.println(name + "has failed");
        } else {
            System.out.println(name + "has passed!!");
        }
    }
}

class Postgraduate extends Student {
    Postgraduate(String name, int marks) {
        super(name, marks);
    }

    void calculateResult() {
        if (marks < 40) {
            System.out.println(name + "has failed");
        } else {
            System.out.println(name + "has passed!!");
        }
    }
}

public class Exp12 {
    public static void main(String[] args) {
        Student s = new Student("akash", 34);
        s.calculateResult();
        Undergraduate u = new Undergraduate("mukesh", 50);
        u.calculateResult();
        Postgraduate p = new Postgraduate("arnav", 95);
        p.calculateResult();
    }
}
