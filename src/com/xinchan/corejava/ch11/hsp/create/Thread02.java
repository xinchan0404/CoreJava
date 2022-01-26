package com.xinchan.corejava.ch11.hsp.create;

/**
 * Java 创建线程方式二：实现 Runnable 接口并实现 run 方法。
 *
 * @author xinchan
 * @version 1.0.1 2022-01-22
 */
public class Thread02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Java 线程测试 " + i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        /*
         * 1. 创建实现了 Runnable 接口的类对象
         */
        Thread02 thread02 = new Thread02();

        /*
         * 2. 使用静态代理的方式，基于 thread02 创建 Thread 类对象
         */
        Thread thread = new Thread(thread02);

        /*
         * 3. 调用 start 方法，启动线程
         */
        thread.start();

        /*
         * 当主线程（main）启动一个子线程 Thread-0 后，主线程不会阻塞，会继续执行。
         * 这是，主线程（main）和子线程（Thread-0）会交替执行
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 " + i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
