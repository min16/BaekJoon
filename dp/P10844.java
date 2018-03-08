package dp;

import java.util.Scanner;

/*
*   Problem 10844.
 *  쉬운 계단수
 */

public class P10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] d = new long[n + 1][10];

        for (int i = 1; i <= 9; i ++) {
            d[1][i] = 1;
        }

        for (int i = 2; i <= n; i ++) {
            for (int j = 0; j <= 9; j ++) {
                if (j - 1 >= 0) d[i][j] += d[i - 1][j - 1];
                if (j + 1 <= 9) d[i][j] += d[i - 1][j + 1];
                d[i][j] %= 1000000000;
            }
        }

        long result = 0L;
        for (int i = 0; i <= 9; i ++) {
            result += d[n][i];
        }

        result %= 1000000000;

        System.out.println(result);
    }
}
