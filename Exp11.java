class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayinfo() {
        System.out.println("name->" + name);
        System.out.println("id->" + id);
    }
}

class Manager extends Employee {
    String dept;

    Manager(String name, int id, String dept) {
        super(name, id);
        this.dept = dept;
    }

    void displayinfo() {
        System.out.println("name->" + name);
        System.out.println("id->" + id);
        System.out.println("dept->" + dept);
    }
}

public class Exp11 {
    public static void main(String args[]) {
        Employee e = new Employee("rahul", 124);
        Manager m = new Manager("shreya", 121, "cse");
        e.displayinfo();
        m.displayinfo();

    }
}
