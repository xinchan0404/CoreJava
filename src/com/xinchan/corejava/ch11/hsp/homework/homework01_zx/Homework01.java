package com.xinchan.corejava.ch11.hsp.homework.homework01_zx;

import java.util.Scanner;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-27
 */
public class Homework01 {
    private static boolean flag = true;

    public static void main(String[] args) {
        Runnable r1 = () -> {
            while (flag) {
                System.out.println(Thread.currentThread().getName() + ": " + (int) (100 * Math.random() + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = () -> {
            Scanner scanner = new Scanner(System.in);
            while (flag) {
                if (scanner.next().equals("Q")) {
                    flag = false;
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
