package com.xinchan.corejava.ch11.hsp.create;

/**
 * Java 创建线程方式一：继承 Thread 类并重写 run 方法
 *
 * @author xinchan
 * @version 1.0.1 2022-01-22
 */
public class Thread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 80; i++) {
            System.out.println("Java 线程测试 " + i + " " + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        /*
         * 1. 创建派生于 Thread 的类对象
         */
        Thread01 thread01 = new Thread01();
        /*
         * 2. 启动线程
         */
        thread01.start();

        /*
         * 当主线程（main）启动一个子线程 Thread-0 后，主线程不会阻塞，会继续执行。
         * 这是，主线程（main）和子线程（Thread-0）会交替执行
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 " + i + " " + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
