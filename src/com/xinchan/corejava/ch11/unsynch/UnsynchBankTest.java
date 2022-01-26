package com.xinchan.corejava.ch11.unsynch;

import com.xinchan.corejava.ch11.threads.Bank;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-23
 */
public class UnsynchBankTest {
    public static final int NACCOUNTS = 100;
    public static final int INITIAL_BALANCE = 1000;
    public static final int MAX_AMOUNT = 1000;
    public static final int DELAY = 100;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try {
                    while (true) {
                        int toAccount = (int) (NACCOUNTS * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(r).start();
        }
    }
}
