package com.xinchan.corejava.ch11.hsp.tickets.synch;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-27
 */
public class SynchSellTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        for (int i = 0; i < 3; i++) {
            Runnable r = () -> {
                while (ticket.getTickets() > 0) {
                    try {
                        ticket.sellTicket();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "售票结束");
            };
            new Thread(r).start();
        }
    }
}
