package com.xinchan.corejava.ch11.synch;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 基于重复锁 ReentrantLock 实现线程同步机制
 *
 * @author xinchan
 * @version 1.0.1 2022-01-25
 */
public class Bank {
    private final double[] accounts;
    private ReentrantLock reentrantLock;
    private Condition sufficientFunds;

    /**
     * Constructs the bank.
     *
     * @param n the number of accounts
     * @param initialBalances the initial balance for each account
     */
    public Bank(int n, double initialBalances) {
        this.accounts = new double[n];
        Arrays.fill(accounts, initialBalances);
        reentrantLock = new ReentrantLock();
        sufficientFunds = reentrantLock.newCondition();
    }

    /**
     * Transfers money from one account to another.
     *
     * @param from the account to transfer from
     * @param to the account to transfer to
     * @param amount the amount to transfer
     */
    public void transfer(int from, int to, double amount) {
        reentrantLock.lock();
        try {
            System.out.println(reentrantLock.getHoldCount());
            if (accounts[from] < amount) {
                sufficientFunds.await();
            }
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
            sufficientFunds.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    /**
     * Gets the sum of all account balances.
     *
     * @return the total balance
     */
    public double getTotalBalance() {
        reentrantLock.lock();
        try {
            double totalBalance = 0;

            for (double balance : accounts) {
                totalBalance += balance;
            }
            return totalBalance;

        } finally {
            reentrantLock.unlock();
        }
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
