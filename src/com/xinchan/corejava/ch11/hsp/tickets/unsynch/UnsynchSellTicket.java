package com.xinchan.corejava.ch11.hsp.tickets.unsynch;

/**
 * 多线程模拟售票系统
 *
 * @author xinchan
 * @version 1.0.1 2022-01-22
 */
public class UnsynchSellTicket extends Thread{
    private int tickets = 100;

    @Override
    public void run() {
        while (tickets > 0) {
            tickets--;
            System.out.println(Thread.currentThread().getName() + "窗口售出了一张票，" +
                    "当前剩余 " + tickets + " 张票~~");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        UnsynchSellTicket win = new UnsynchSellTicket();

        new Thread(win).start();  // 窗口 1
        new Thread(win).start();  // 窗口 2
        new Thread(win).start();  // 窗口 3
    }
}
