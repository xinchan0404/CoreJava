package com.xinchan.corejava.ch11.synch2;

import java.util.Arrays;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-26
 */
public class Bank {
    private final double[] accounts;

    /**
     * Constructs the bank.
     *
     * @param n the number of accounts
     * @param initialBalances the initial balance for each account
     */
    public Bank(int n, double initialBalances) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalances);
    }

    /**
     * Transfers money from one account to another.
     *
     * @param from the account to transfer from
     * @param to the account to transfer to
     * @param amount the amount to transfer
     */
    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        if (accounts[from] < amount) {
            this.wait();
        }
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        this.notifyAll();
    }

    /**
     * Gets the sum of all account balances.
     *
     * @return the total balance
     */
    public synchronized double getTotalBalance() {
        double totalBalance = 0;
        for (double account : accounts) {
            totalBalance += account;
        }

        return totalBalance;
    }

    /**
     * Gets the number of accounts in the bank.
     *
     * @return the number of accounts
     */
    public int size() {
        return accounts.length;
    }
}
