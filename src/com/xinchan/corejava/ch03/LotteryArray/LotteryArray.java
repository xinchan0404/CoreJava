package com.xinchan.corejava.ch03.LotteryArray;

/**
 * @author zhengxin
 * @version 1.0.1 2021-10-24
 */
public class LotteryArray {
    public static void main(String[] args) {
        // 杨辉三角的行数
        final int N_MAX = 10;

        // 节省内存
        int[][] triangularArray = new int[N_MAX][];
        for (int i = 0; i < N_MAX; i++) {
            triangularArray[i] = new int[i + 1];
        }

        // 构造杨辉三角
        for (int i = 0; i < N_MAX; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == 0 || i == 1) {
                    triangularArray[i][j] = 1;
                } else if (j == 0 || j == i) {
                    triangularArray[i][j] = 1;
                } else {
                    triangularArray[i][j] = triangularArray[i - 1][j - 1] + triangularArray[i - 1][j];
                }
            }
        }

        // 打印杨辉三角
        for (int i = 0; i < N_MAX; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%5d", triangularArray[i][j]);
            }
            System.out.println();
        }
    }
}
