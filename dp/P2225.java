package dp;

/*
* Problem 2225.
* 합분해
*/

import java.util.Scanner;

public class P2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[][] d = new long[K + 1][N + 1];
        d[0][0] = 1L;

        for (int i = 1; i <= K; i ++) {
            for (int j = 0; j <= N; j ++) {
                for (int l = 0; l <= j; l ++) {
                    d[i][j] += d[i - 1][j - l];
                    d[i][j] %= 1000000000L;
                }
            }
        }

        System.out.println(d[K][N]);
    }
}
