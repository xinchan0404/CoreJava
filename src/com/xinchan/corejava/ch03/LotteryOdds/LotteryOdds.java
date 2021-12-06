package com.xinchan.corejava.ch03.LotteryOdds;

import java.util.Scanner;

/**
 * This program demonstrates a for loop
 * @author zhengxin
 * @version 1.0.1 2021-10-24
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the highest number you can draw? ");
        int n = scanner.nextInt();

        System.out.println("How many numbers do you need to draw? ");
        int k = scanner.nextInt();

        /*
         * compute binomial coefficient n*(n-1)*...*(n-k+1) / (1*2*...*k)
         */
        int lotteryOdds = 1;
        for (int i = 0; i < k; i++) {
            lotteryOdds = lotteryOdds * (n - i) / (i + 1);
        }

        System.out.println("Your odds is 1 / " + lotteryOdds + ". Good lucky!");
    }
}
