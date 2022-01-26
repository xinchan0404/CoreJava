package com.xinchan.corejava.ch11.synch;

/**
 * 基于 Lock 和 Condition 接口实现同步机制
 * @author xinchan
 * @version 1.0.1 2022-01-26
 */
public class SynchronizedTest {
     public static void main(String[] args) throws InterruptedException {
         final int NACCOUNTS = 100;
         final int DELAY = 10000;
         final int MAX_AMOUNT = 1000;
         final int INITIAL_BALANCE = 1000;

         Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
         for (int i = 0; i < NACCOUNTS; i++) {
             int fromAccount = i;
             Runnable r = () -> {
                 while (true) {
                     int toAccount = (int) (NACCOUNTS * Math.random());
                     bank.transfer(fromAccount, toAccount, (int) (MAX_AMOUNT * Math.random()));
                     try {
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
