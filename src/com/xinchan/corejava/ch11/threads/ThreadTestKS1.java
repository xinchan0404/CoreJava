package com.xinchan.corejava.ch11.threads;

/**
 * 遇见狂神说-多线程详解-创建线程-测试1
 *
 * @author xinchan
 * @version 1.0.1 2022-01-09
 */
public class ThreadTestKS1 {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.print(Thread.currentThread());
                System.out.println(" 线程 1 正在运行~~");
            }
        };

        new Thread(task).start();

        for (int i = 0; i < 1000; i++) {
            System.out.print(Thread.currentThread());
            System.out.println(" 主线程正在运行~~");
        }
    }
}
