package com.xinchan.corejava.ch03.BigIntegerTest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author zhengxin
 * @version 1.0.1 2021-10-24
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the highest number you can draw? ");
        int n = scanner.nextInt();

        System.out.println("How many number do you need to draw? ");
        int k = scanner.nextInt();

        /*
         * compute binomial coefficient n*(n-1)*...*(n-k+1) / (1*2*...*k)
         */
        BigInteger lotteryOdds = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i)).divide(BigInteger.valueOf(i + 1));
        }

        System.out.println("Your odds is 1 / " + lotteryOdds + ". Good Lucky!");
    }
}
