package com.xinchan.corejava.ch11.hsp.homework.homework01_hsp;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-27
 */
public class ThreadA implements Runnable{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println(Thread.currentThread().getName() + ": " + (int) (100 * Math.random() + 1));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
