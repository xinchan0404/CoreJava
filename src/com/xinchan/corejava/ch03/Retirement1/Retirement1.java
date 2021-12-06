package com.xinchan.corejava.ch03.Retirement1;

import java.util.Scanner;

/**
 * This program demonstrate while
 * @author zhengxin
 * @version 1.0.1 2021-10-24
 */
public class Retirement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money do you need to retire? ");
        double goal = scanner.nextDouble();

        System.out.println("How much money will you contribute every year? ");
        double payment = scanner.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int year = 0;

        while (balance <= goal) {
            // 第一年不计算利息
            balance += payment;
            balance += balance * interestRate / 100;
            year++;
        }

        System.out.println("You can retire in " + year + " years.");

    }
}
