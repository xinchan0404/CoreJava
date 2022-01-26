package com.xinchan.corejava.ch11.hsp.method;

/**
 * Thread 类常用方法测试
 * @author xinchan
 * @version 1.0.1 2022-01-25
 */
public class Method01 {
    public static void main(String[] args) throws InterruptedException{
        Runnable r = () -> {
            while (true) {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " 正在运行中~~" + i);
                }

                try {
                    System.out.println(Thread.currentThread().getName() + " 正在休眠中~~");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "被 interrupt 了~~");
                }
            }
        };
        Thread thread = new Thread(r);
        thread.start();

        /*
         * 主线程完成任务后，interrupt 子线程
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("倒计时开始 " + (5 - i));
            Thread.sleep(1000);
        }
        thread.interrupt();
    }
}
