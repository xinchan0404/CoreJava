package com.xinchan.corejava.ch11.hsp.exit;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-23
 */
public class ThreadExit {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        new Thread(thread01).start();

        System.out.println("主线程等待子线程运行 5 s，再终止子线程~~");
        try {
            Thread.sleep(5 * 1000);
            thread01.setFlag(false);
            System.out.println("主线程已经终止子线程~~");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
