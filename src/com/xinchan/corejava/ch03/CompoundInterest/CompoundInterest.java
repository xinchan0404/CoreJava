package com.xinchan.corejava.ch03.CompoundInterest;

/**
 * @author zhengxin
 * @version 1.0.1 2021-10-24
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final int N_YEAR = 10;
        final int N_RATE = 6;
        final int START_RATE = 10;
        final double CAPITAL = 10000.0;

        int[] interestRate = new int[N_RATE];
        for (int i = 0; i < N_RATE; i++) {
            interestRate[i] = START_RATE + i;
        }

        double[][] balance = new double[N_YEAR][N_RATE];
        for (int i = 0; i < N_YEAR; i++) {
            for (int j = 0; j < N_RATE; j++) {
                balance[i][j] = 10000 * Math.pow(((100 + interestRate[j]) / 100.0), j);
            }
        }

        for (int e : interestRate) {
            System.out.printf("%9d %%", e);
        }
        System.out.println();
        for (double[] row : balance) {
            for (double e : row) {
                System.out.printf("%11.2f", e);
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(balance));
    }
}
