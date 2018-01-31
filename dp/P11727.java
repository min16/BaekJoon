package dp;

import java.util.Scanner;

public class P11727 {

    private static int[] d;

    private static int getWays(int n) {
        d[1] = 1;
        d[2] = 3;

        for (int i = 3; i <= n; i ++) {
            d[i] = (d[i - 1] + d[i - 2] * 2) % 10007;
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
