package com.xinchan.corejava.ch11.threads;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-09
 */
public class ThreadTest {
    /*
     * instance field
     */
    private static final int DELAY = 10;
    private static final int STEPS = 100;
    private static final int MAX_AMOUNT = 1000;

    public static void main(String[] args) {
        Bank bank = new Bank(4, 100000);

        Runnable task1 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(0, 1, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable task2 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(1, 2, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
