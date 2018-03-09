package dp;

/*
* Problem 11055.
* 가장 큰 증가 부분 수열
*/

import java.util.Scanner;

public class P11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //initial input array
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i ++) {
            a[i] = sc.nextInt();
        }

        int[] d = new int[n + 1];
        int max = d[1];
        
        for (int i = 1; i <= n; i ++) {
            d[i] = a[i];
            for (int j = i - 1; j > 0; j --) {
                if (a[j] < a[i] && d[i] < d[j] + a[i]) {
                    d[i] = d[j] + a[i];
                }
            }
            max = Math.max(d[i], max);
        }

        System.out.println(max);
    }
}
