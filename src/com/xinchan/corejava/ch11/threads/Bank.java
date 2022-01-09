package com.xinchan.corejava.ch11.threads;

import java.util.Arrays;

/**
 * A bank with a number of bank accounts
 *
 * @author xinchan
 * @version 1.0.1 2022-01-09
 */
public class Bank {
    /*
     * instance field
     */
    private final double[] accounts;

    /**
     * Constructs the bank.
     *
     * @param n the number of accounts
     * @param initialBalances the initial balance for each account
     */
    public Bank(int n, double initialBalances) {
        this.accounts = new double[n];
        Arrays.fill(accounts, initialBalances);
    }

    /**
     * Transfers money from one account to another.
     *
     * @param from the account to transfer from
     * @param to the account to transfer to
     * @param amount the amount to transfer
     */
    public void transfer(int from, int to, double amount) {
        if (accounts[from] < amount) return;
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
    }

    /**
     * Gets the sum of all account balances.
     *
     * @return the total balance
     */
    public double getTotalBalance() {
        double totalBalance = 0;

        for (double balance : accounts) {
            totalBalance += balance;
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
