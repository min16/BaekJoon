package dp;

import java.util.Scanner;

/* Problem 1912.
*  연속합
*/
public class P1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i ++) {
            a[i] = sc.nextInt();
            d[i] = a[i];
        }

        int max = d[1];
        for (int i = 1; i <= n; i ++) {
            d[i] = d[i - 1] + a[i];
            if (d[i] < a[i]) {
                d[i] = a[i];
            }
            max = Math.max(max, d[i]);
        }

        System.out.println(max);

        int current = a[1];
        int answer = a[1];
        for (int i = 2; i <= n; i ++) {
            current = Math.max(current + a[i], a[i]);
            answer = Math.max(current, answer);
        }

        System.out.println(answer);
    }
}
