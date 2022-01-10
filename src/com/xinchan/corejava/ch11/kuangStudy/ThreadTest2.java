package com.xinchan.corejava.ch11.kuangStudy;

/**
 * 狂神说-多线程详解-创建线程-测试2：实现 Runnable 接口
 * @author xinchan
 * @version 1.0.1 2022-01-10
 */
public class ThreadTest2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(Thread.currentThread());
            System.out.println(" 线程 0 正在运行 " + i);
        }
    }

    public static void main(String[] args) {
        /*
         * 创建 Runnable 对象并开启线程 0
         */
        ThreadTest2 threadTest2 = new ThreadTest2();
        new Thread(threadTest2).start();

        /*
         * 主线程（main 线程）
         */
        for (int i = 0; i < 1000; i++) {
            System.out.print(Thread.currentThread());
            System.out.println(" 主线程正在运行 " + i);
        }
    }
}
