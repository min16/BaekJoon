package dp;

import java.util.Scanner;

/*
     Problem 11052.
     붕어빵 판매하기
*/


public class P11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] p = new int[n + 1];
        for (int i = 1; i <= n; i ++) {
            p[i] = sc.nextInt();
        }

        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = p[i];
            for (int j = 1; j <= i / 2; j ++) {
                d[i] = Math.max(d[i], d[j] + d[i - j]);
            }
        }

        System.out.println(d[n]);
    }
}
