package com.xinchan.corejava.ch11.hsp.exit;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-23
 */
public class Thread01 implements Runnable{
    private boolean flag = true;

    @Override
    public void run() {
        for (int i = 0; i < 100 && flag; i++) {
            System.out.println(Thread.currentThread().getName() + " 线程正在运行 " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
