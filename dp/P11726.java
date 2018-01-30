package dp;

/*
* Problem 11726
* 2xn 타일링
*/

import java.util.Scanner;

public class P11726 {

    private static int[] d;

    private static int getWays(int n) {
        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i <= n; i ++) {
            d[i] = d[i - 2] + d[i - 1];
            // overflow 방지
            d[i] %= 10007;
        }

        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n + 1];
        int ways = getWays(n);
        System.out.println(ways);
    }
}
