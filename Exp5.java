
import java.util.Scanner;

public class Exp5 {

    // a) Reverse string
    static String reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    // b) Count vowels and consonants
    static void countVC(String s) {
        int v = 0, c = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    v++;
                else
                    c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }

    // c) Remove duplicates
    static String removeDuplicates(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (!res.contains("" + s.charAt(i))) {
                res += s.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int choice;
        do {
            System.out.println("\n1. Check Palindrome");
            System.out.println("2. Reverse String");
            System.out.println("3. Count Vowels & Consonants");
            System.out.println("4. Remove Duplicates");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (str.equals(reverseString(str)))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 2:
                    System.out.println("Reverse: " + reverseString(str));
                    break;

                case 3:
                    countVC(str);
                    break;

                case 4:
                    System.out.println("Without duplicates: " + removeDuplicates(str));
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
