package dp;
/*
* Problem 1463.
* 1로 만들기
*/

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class P1463 {
    private static int[] d;

//    private static int makeOne(int n) {
//        d[1] = 0;
//
//        for (int i = 2; i <= n; i ++) {
//            d[i] = d[i - 1] + 1;
//
//            if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
//                d[i] = d[i / 2] + 1;
//            }
//            if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
//                d[i] = d[i / 3] + 1;
//            }
//        }
//
//        return d[n];
//    }

    private static int makeOneBottomUp(int n) {
        d[1] = 0;

        for (int i = 2; i <= n; i ++) {
            d[i] = d[i - 1] + 1;

            if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
                d[i] = d[i / 2] + 1;
            }
            if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
                d[i] = d[i / 3] + 1;
            }
        }

        return d[n];
    }

    private static int makeOneTopDown(int n) {
        if (n == 1) return 0;
        if (d[n] > 0) return d[n];

        d[n] = makeOneTopDown(n - 1) + 1;

        if (n % 2 == 0) {
            int temp = makeOneTopDown(n / 2) + 1;
            if (d[n] > temp) {
                d[n] = makeOneTopDown(n / 2) + 1;
            }
        }

        if (n % 3 == 0) {
            int temp = makeOneTopDown(n / 3) + 1;
            if (d[n] > temp) {
                d[n] = makeOneTopDown(n / 3) + 1;
            }
        }

        return d[n];
    }

    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            d = new int[n + 1];
            System.out.println(makeOneBottomUp(n));
            System.out.println(makeOneTopDown(n));
    }

    @Test
    public void testMakeOne() {
        assertEquals(1, makeOneTopDown(2));
        assertEquals(1, makeOneBottomUp(2));
        assertEquals(3, makeOneBottomUp(10));
        assertEquals(3, makeOneTopDown(10));
    }
}
