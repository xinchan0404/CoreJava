package com.xinchan.corejava.ch03.LotteryDrawing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhengxin
 * @version 1.0.1 2021-10-24
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the highest number you can draw? ");
        int n = scanner.nextInt();

        System.out.println("How many number do you need to draw? ");
        int k = scanner.nextInt();

/*
        int[] lotteryOdds = new int[k];
        for (int i = 0; i < k; i++) {
            lotteryOdds[i] = (int) (Math.random() * n);
        }
*/
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        int[] lotteryOdds = new int[k];
        for (int i = 0; i < k; i++) {
            int index = (int) (Math.random() * n);
            lotteryOdds[i] = numbers[index];

            numbers[index] = numbers[n - 1];
            n--;
        }

        Arrays.sort(lotteryOdds);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int e : lotteryOdds) {
            System.out.println(e);
        }
    }
}
