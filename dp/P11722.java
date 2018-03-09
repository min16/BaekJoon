package dp;

/*
* Problem 11722.
* 가장 긴 감소하는 부분 수열
*/

import java.util.Scanner;

public class P11722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i ++) {
            a[i] = sc.nextInt();
        }

        int[] d = new int[n + 1];
        int max = 1;

        for (int i = 1; i <= n; i ++) {
            d[i] = 1;
            for (int j = i - 1; j > 0; j --) {
                if (a[i] < a[j] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                }
            }
            max = Math.max(max, d[i]);
        }

        System.out.println(max);
    }
}
