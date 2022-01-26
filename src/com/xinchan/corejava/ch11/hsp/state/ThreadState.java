package com.xinchan.corejava.ch11.hsp.state;

/**
 * Java 线程的状态
 *
 * @author xinchan
 * @version 1.0.1 2022-01-25
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            try {
                for (int i = 0; i < 20; i++) {
//                    System.out.println(Thread.currentThread().getName() + " 正在运行~~" + i);
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(r);
        System.out.println(thread.getName() + " " + thread.getState());
        thread.start();

        while (thread.getState() != Thread.State.TERMINATED) {
            System.out.println(thread.getName() + " " + thread.getState());
            Thread.sleep(500);
        }

        System.out.println(thread.getName() + " " + thread.getState());
    }
}
