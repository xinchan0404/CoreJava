package com.xinchan.corejava.ch11.kuangStudy;

/**
 * 遇见狂神说-多线程详解-创建线程-测试1：继承 Thread Class
 *
 * @author xinchan
 * @version 1.0.1 2022-01-09
 */
public class ThreadTest1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(Thread.currentThread());
            System.out.println(" 线程 0 正在运行~~");
        }
    }

    public static void main(String[] args) {
        /*
         * 创建 Thread 子类对象并启动线程
         */
        ThreadTest1 threadTest1 = new ThreadTest1();
        threadTest1.start();

        /*
         * 主线程
         */
        for (int i = 0; i < 100; i++) {
            System.out.print(Thread.currentThread());
            System.out.println(" 主线程正在运行~~");
        }
    }
}
