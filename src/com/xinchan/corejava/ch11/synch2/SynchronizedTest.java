package com.xinchan.corejava.ch11.synch2;

/**
 * 基于 synchronized 关键字实现同步机制
 * @author xinchan
 * @version 1.0.1 2022-01-26
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        final int DELAY = 1000;
        final int MAX_AMOUNT = 1000;
        final int INITIAL_BALANCE = 1000;
        final int ACCOUNT_NUM = 100;

        Bank bank = new Bank(ACCOUNT_NUM, INITIAL_BALANCE);
        for (int i = 0; i < ACCOUNT_NUM; i++) {
            int from = i;
            Runnable r = () -> {
                while (true) {
                    int to = (int) (ACCOUNT_NUM * Math.random());
                    double amount = MAX_AMOUNT * Math.random();
                    try {
                        bank.transfer(from, to, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            new Thread(r).start();
        }
    }
}
