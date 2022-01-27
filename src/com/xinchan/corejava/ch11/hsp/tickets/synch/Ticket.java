package com.xinchan.corejava.ch11.hsp.tickets.synch;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-27
 */
public class Ticket {
    private int tickets;

    public Ticket(int n) {
        this.tickets = n;
    }

    /**
     * 售票
     *
     * @throws InterruptedException
     */
    public synchronized void sellTicket() throws InterruptedException {
        if (tickets <= 0) {
            return;
        }
        tickets--;
        System.out.println(Thread.currentThread().getName() + " 售票 1 张  余票：" + tickets);
        Thread.sleep(10);
    }

    public boolean hasTicket() {
        return getTicket() > 0;
    }

    /**
     * 获取余票
     *
     * @return
     */
    public int getTicket() {
        return tickets;
    }
}
