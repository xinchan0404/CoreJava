package com.xinchan.corejava.ch11.kuangStudy;

/**
 * 狂神说-多线程详解-创建线程-测试2：实现 Runnable 接口、lambda 表达式
 * @author xinchan
 * @version 1.0.1 2022-01-10
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        /*
         * 利用 lambda 表达式创建 Runnable 对象
         */
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print(Thread.currentThread());
                System.out.println(" 线程 0 正在运行 " + i);
            }
        };
        new Thread(task).start();  // 启动线程

        /*
         * 主线程
         */
        for (int i = 0; i < 100; i++) {
            System.out.print(Thread.currentThread());
            System.out.println(" 主线程正在运行 " + i);
        }
    }
}
