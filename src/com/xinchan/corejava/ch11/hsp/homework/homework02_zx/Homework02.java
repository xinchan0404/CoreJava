package com.xinchan.corejava.ch11.hsp.homework.homework02_zx;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-28
 */
public class Homework02 {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Runnable r = () -> {
            while (account.hasBalance()) {
                try {
                    account.draw(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": 账户余额不足~~");
        };

        Thread thread1 = new Thread(r);
        thread1.setName("用户1");
        thread1.start();

        Thread thread2 = new Thread(r);
        thread2.setName("用户2");
        thread2.start();
    }
}
