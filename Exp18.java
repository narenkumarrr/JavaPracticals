import java.util.*;

class Employee1 {
    int id;
    String name;
    String dept;
    int salary;

    Employee1(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class Exp18 {
    public static void main(String args[]) {
        List<Employee1> employees = new ArrayList<>();

        employees.add(new Employee1(1, "Amit", "IT", 60000));
        employees.add(new Employee1(2, "Riya", "HR", 45000));
        employees.add(new Employee1(3, "Naren", "Finance", 70000));
        employees.add(new Employee1(4, "Ankit", "IT", 52000));
        employees.add(new Employee1(5, "Om", "Sales", 30000));

        // a. Filter and display employees whose salary is greater than 50,000.
        System.out.println("Employees with salary > 50000:");
        employees.stream()
                .filter(e -> e.salary > 50000)
                .forEach(e -> System.out.println(e.name + "->" + e.salary));

        // b) Employees from IT department
        System.out.println("\nEmployees from IT department:");
        employees.stream()
                .filter(e -> e.dept.equals("IT"))
                .forEach(e -> System.out.println(e.name));
        // c) Sort employees by salary in descending order
        System.out.println("\nEmployees sorted by salary (descending):");
        employees.stream()
                .sorted((e1, e2) -> e2.salary - e1.salary)
                .forEach(e -> System.err.println(e.name + "->" + e.salary));
        // d) Count employees whose names start with a vowel
        long count = employees.stream()
                .filter(e -> {
                    char ch = Character.toLowerCase(e.name.charAt(0));
                    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
                })
                .count();
        System.out.println("\nNumber of employees whose names start with a vowel: " + count);
    }
}
