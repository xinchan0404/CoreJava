package com.xinchan.corejava.ch11.hsp.method;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-25
 */
public class Method02 {
    public static void main(String[] args) throws InterruptedException{
        Runnable r = () -> {
            for (int i = 1; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName() + " 正在运行~~" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(r);
        thread.start();

        /*
         * 主线程输出 5 次后，让子线程插队
         */
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + " 正在运行~~" + i);
            Thread.sleep(1000);
            if (i == 5) {
                System.out.println("子线程插队~~");
               thread.join(); // 线程插队，一定成功
//                System.out.println("主线程礼让~~");
//                Thread.yield();  // 线程礼让，不一定成功
            }
        }
    }
}
