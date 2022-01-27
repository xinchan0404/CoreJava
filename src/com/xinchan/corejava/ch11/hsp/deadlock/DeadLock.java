package com.xinchan.corejava.ch11.hsp.deadlock;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-27
 */
public class DeadLock implements Runnable{
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();
    private final boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (obj1) {
                System.out.println(Thread.currentThread().getName() + " 进入 1");
                synchronized (obj2) {
                    System.out.println(Thread.currentThread().getName() + " 进入 2");
                }
            }
        } else {
            synchronized (obj2) {
                System.out.println(Thread.currentThread().getName() + " 进入 3");
                synchronized (obj1) {
                    System.out.println(Thread.currentThread().getName() + " 进入 4");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new DeadLock(true)).start();
        new Thread(new DeadLock(false)).start();
    }
}
