//1. Write a program to search for an element in an integer array using linear search and return its index. bare minimum
public class Exp1 {

    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // element found
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 7, 1, 9 };
        int key = 7;

        int index = search(arr, key);
        System.out.println(index);
    }

}
