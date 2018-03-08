package dp;

/*
*  Problem 11053.
*  가장 긴 증가하는 부분 수열
*/

import java.util.Scanner;

public class P11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] d = new int[n + 1];

        for (int i = 1; i <= n; i ++) {
            a[i] = sc.nextInt();
            d[i] = 1;
        }

        int max = d[1];
        for (int i = 2; i <= n; i ++) {
            for (int j = i - 1; j >= 1; j --) {
                if (a[j] < a[i] && d[i] <= d[j]) {
                    d[i] = d[j] + 1;
                }
            }
            max = Math.max(max, d[i]);
        }

        System.out.println(max);
    }
}
