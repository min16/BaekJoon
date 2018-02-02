package dp;

/*
* Problem 2193.
* 이친수
*/

import java.util.Scanner;

public class P2193 {
    // runtime error
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[][] d = new long[n + 1][2];
//        d[2][0] = 1;
//
//        for (int i = 3; i <= n; i ++) {
//            d[i][0] = d[i - 1][0] + d[i - 1][1];
//            d[i][1] = d[i - 1][0];
//        }
//
//        System.out.println(d[n][0] + d[n][1]);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[n + 1];
        d[1] = 1;
        if (n >= 2) {
            d[2] = 1;
        }

        for (int i = 3; i <= n; i ++) {
            d[i] = d[i - 2] + d[i - 1];
        }

        System.out.println(d[n]);
    }

}
