package com.xinchan.corejava.ch11.hsp.method;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-25
 */
public class Method03 {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 正在运行~~" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(r);
        thread.setDaemon(true);  // 将子线程设置为守护线程，必须在线程启动前调用
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " 正在运行~~" + i);
            Thread.sleep(1000);
        }
    }
}
