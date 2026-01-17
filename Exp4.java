
//4. Given a list of students, use Java Streams to: a. Filter students with marks > 75 b. Find average marks c. Group students by grade
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
                new Student("D", 60, "C")
        };

        // a) Filter marks > 75
        for (int i = 0; i < students.length; i++) {
            if (students[i].marks > 75)
                System.out.println(students[i].name);
        }

        // b) Average marks
        int sum = 0;
        for (int i = 0; i < students.length; i++)
            sum += students[i].marks;

        System.out.println((double) sum / students.length);

        // c) Group by grade (ARRAY ONLY)
        Student[] gradeA = new Student[10];
        Student[] gradeB = new Student[10];
        Student[] gradeC = new Student[10];

        int a = 0, b = 0, c = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].grade.equals("A"))
                gradeA[a++] = students[i];
            else if (students[i].grade.equals("B"))
                gradeB[b++] = students[i];
            else if (students[i].grade.equals("C"))
                gradeC[c++] = students[i];
        }

        System.out.println("Grade A:");
        for (int i = 0; i < a; i++)
            System.out.println(gradeA[i].name);

        System.out.println("Grade B:");
        for (int i = 0; i < b; i++)
            System.out.println(gradeB[i].name);

        System.out.println("Grade C:");
        for (int i = 0; i < c; i++)
            System.out.println(gradeC[i].name);
    }
}
