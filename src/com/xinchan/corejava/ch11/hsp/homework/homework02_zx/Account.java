package com.xinchan.corejava.ch11.hsp.homework.homework02_zx;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-27
 */
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public boolean hasBalance() {
        return getBalance() > 0;
    }

    public int getBalance() {
        return balance;
    }

    /**
     * 取款
     *
     * @param balance 取款数
     */
    public synchronized void draw(int balance) throws InterruptedException {
        if (this.balance <= 0) {
            return;
        }
        this.balance -= balance;
        System.out.print(Thread.currentThread().getName() + "取款 1000");
        System.out.println("  账户当前余额 " + this.getBalance());
        Thread.sleep(50);
    }
}
