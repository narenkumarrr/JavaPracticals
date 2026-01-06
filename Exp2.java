//2. Create a 3×3 matrix and compute the sum of its diagonal elements.
public class Exp2 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += mat[i][i];
        }

        System.out.println(sum);
    }

}
