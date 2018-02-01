package dp;

import java.util.Scanner;

/*
*   Problem 9095.
*   1,2,3 더하기
*/
public class P9095 {

    public static void main(String[] args) {
        int[] d = new int[11];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i ++) {
            int n = sc.nextInt();

            for (int j = 4; j <= n; j ++) {
                d[j] = d[j - 1] + d[j - 2] + d[j - 3];
            }

            System.out.println(d[n]);
        }
    }
}
