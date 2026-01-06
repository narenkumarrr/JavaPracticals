//4. Given a list of students, use Java Streams to: a. Filter students with marks > 75 b. Find average marks c. Group students by grade
import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;
    String grade;

    Student(String name, int marks, String grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }
}

public class Exp4 {

    public static void main(String[] args) {

        Student[] students = {
                new Student("A", 80, "A"),
                new Student("B", 70, "B"),
                new Student("C", 90, "A"),
                new Student("D", 60, "C") };

        // a) Filter students with marks > 75
        Arrays.stream(students)
                .filter(s -> s.marks > 75)
                .forEach(s -> System.out.println(s.name));

        // b) Average marks
        double avg = Arrays.stream(students)
                .mapToInt(s -> s.marks)
                .average()
                .getAsDouble();
        System.out.println("Average: " + avg);

        // c) Group by grade
        Map<String, List<Student>> group = Arrays.stream(students)
                .collect(Collectors.groupingBy(s -> s.grade));

        System.out.println(group);
    }
}
