package com.xinchan.corejava.ch03.Retirement2;

import java.util.Scanner;

/**
 * This program demonstrate while
 * @author zhengxin
 * @version 1.0.1 2021-10-24
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money will you contribute every year? ");
        double payment = scanner.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int year = 0;
        String input;

        do {
            balance += payment;
            balance += balance * interestRate / 100;
            year++;
            System.out.println("Your balance is " + balance);
            System.out.println("Ready to retire? (Y/N)");
            input = scanner.next();
        }
        while (input.equals("N"));

        System.out.println("Your balance is " + balance + " and you spend " + year + " years.");
    }
}
