package dp;

/*
* Problem 11054.
* 가장 긴 바이토닉 부분 수열
*/

import java.util.Scanner;

public class P11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] d1 = new int[n + 1];
        int[] d2 = new int[n + 1];

        for (int i = 1; i <= n; i ++) {
            a[i] = sc.nextInt();
            d1[i] = 1;
            d2[i] = 1;
        }

        for (int i = 1; i <= n; i ++) {
            for (int j = i - 1; j > 0; j --) {
                if (a[j] < a[i] && d1[i] < d1[j] + 1) {
                    d1[i] = d1[j] + 1;
                }
            }
        }

        for (int i = n; i > 0; i --) {
            for (int j = i + 1; j <= n; j ++) {
                if (a[i] > a[j] && d2[i] < d2[j] + 1) {
                    d2[i] = d2[j] + 1;
                }
            }
        }

        int max = d1[1] + d2[1] - 1;
        for (int i = 2; i <= n; i ++) {
            max = Math.max(max, d1[i] + d2[i] - 1);
        }

        System.out.println(max);
    }
}
