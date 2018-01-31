package dp;

import java.util.Scanner;

/*
     d[i]는 p[1] + d[i-1] 부터 p[i] + d[0] 값 중 max 값
     ex)
     d[3]은 p[1] + d[2] ~ p[3] + d[0] 중 max 값
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
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= i; j ++) {
                d[i] = Math.max(d[i], d[i - j] + p[j]);
            }
        }

        System.out.println(d[n]);
    }
}
