package com.xinchan.corejava.ch11.hsp.create;

/**
 * 模拟静态代理实现 start 方法的调用
 *
 * @author xinchan
 * @version 1.0.1 2022-01-22
 */
public class Thread03 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("静态代理模式模拟 " + i + " " + Thread.currentThread().getName());
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
        Thread03 thread03 = new Thread03();

        /*
         * 2. 使用静态代理的方式，基于 thread02 创建 ThreadProxy 类对象
         */
        ThreadProxy threadProxy = new ThreadProxy(thread03);

        /*
         * 3. 调用 start 方法，启动线程
         */
        threadProxy.start();
    }
}
