package dp;

/*
* Problme 9461.
*  파도반 수열
*/

import java.util.Scanner;

public class P9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i ++) {
            int n = sc.nextInt();
            long[] d = new long[5];
            d[0] = 1L;
            d[1] = 1L;
            d[2] = 1L;
            d[3] = 2L;
            d[4] = 2L;

            for (int j = 5; j < n; j ++) {
                d[j % 5] = d[(j - 1) % 5] + d[(j - 5) % 5];
            }

            System.out.println(d[(n - 1) % 5]);
        }
    }
}
