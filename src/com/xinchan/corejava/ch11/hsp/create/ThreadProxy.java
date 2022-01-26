package com.xinchan.corejava.ch11.hsp.create;

/**
 * 基于静态代理模式，实现一个极简的 Thread 类。
 * @author xinchan
 * @version 1.0.1 2022-01-22
 */
public class ThreadProxy {
    private Runnable target;

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void run() {
        if (target != null) {
            target.run();  // 实现 ThreadProxy 和 Thread03 动态绑定，运行类型 Thread03
        }
    }

    public void start() {
        start0();
    }

    private void start0() {
        run();
    }
}
