package dp;

/*
 * Problem 2156.
 * 포도주 시식
 */

import java.util.Scanner;

public class P2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d[] = new int[n + 1];
        int amount[] = new int[n + 1];

        // initial amount array
        for (int i = 1; i <= n; i ++) {
            amount[i] = sc.nextInt();
        }

        d[1] = amount[1];
        if (n >= 2) {
            d[2] = amount[1] + amount[2];
        }

        for (int i = 3; i <= n; i ++) {
            d[i] = d[i - 1];
            if (d[i] < d[i - 2] + amount[i]) {
                d[i] = d[i - 2] + amount[i];
            }
            if (d[i] < d[i - 3] + amount[i] + amount[i - 1]) {
                d[i] = d[i - 3] + amount[i] + amount[i - 1];
            }
        }

        System.out.println(d[n]);
    }
}
