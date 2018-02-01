package dp;

import java.util.Scanner;

/*
*  Problem 11057
*  오르막수
*/
public class P11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = 10007;
        long[][] d = new long[n + 1][10];

        for (int i = 0; i <= 9; i ++) {
            d[1][i] = 1;
        }

        for (int i = 2; i <= n; i ++) {
            for (int j = 0; j <= 9; j ++) {
                for (int k = 0; k <= j; k ++) {
                    d[i][j] += d[i - 1][k];
                    d[i][j] %= mod;
                }
            }
        }
        long result = 0L;
        for (int i = 0; i <= 9; i ++) {
            result += d[n][i];
            result %= mod;
        }
        System.out.println(result);
    }
}
