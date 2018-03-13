package dp;

/*
* Problem 2579.
* 계단 오르기
*/

import java.util.Scanner;

public class P2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i ++) {
            a[i] = sc.nextInt();
        }

        int[][] d = new int[n + 1][2];
        d[1][0] = a[1];
        d[1][1] = a[1];
        for (int i = 2; i <= n; i ++) {
            d[i][0] = Math.max(d[i - 2][0], d[i - 2][1]) + a[i];
            d[i][1] = d[i - 1][0] + a[i];
        }

        System.out.println(Math.max(d[n][0], d[n][1]));
    }
}
