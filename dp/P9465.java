package dp;

/* Problem 9465.
*  스티커
*/

import java.util.Scanner;

public class P9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int matrix[][] = new int[n][2];

            // initial matrix
            for (int row = 0; row < 2; row++) {
                for (int col = 0; col < n; col++) {
                    matrix[col][row] = sc.nextInt();
                }
            }

            // initial array d, matrix sum
            int d[][] = new int[n][3];
            d[0][1] = matrix[0][0];
            d[0][2] = matrix[0][1];

            // get Max sum of each column
            for (int j = 1; j < n; j ++) {
                int neither = d[j - 1][0];
                int first = d[j - 1][1];
                int second = d[j - 1][2];
                d[j][0] = Math.max(Math.max(neither, first), second);
                d[j][1] = Math.max(neither, second) + matrix[j][0];
                d[j][2] = Math.max(neither, first) + matrix[j][1];
            }

            // print result
            System.out.println(Math.max(Math.max(d[n - 1][0], d[n - 1][1]), d[n - 1][2]));
        }
    }
}
