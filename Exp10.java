class Calculator {

    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add two floats
    float add(float a, float b) {
        return a + b;
    }

    // add elements of an integer array
    int add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
}

public class Exp10 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(5, 10)); // int
        System.out.println(c.add(2.5f, 3.5f)); // float
        System.out.println(c.add(new int[] { 1, 2, 3, 4 })); // array
    }
}
