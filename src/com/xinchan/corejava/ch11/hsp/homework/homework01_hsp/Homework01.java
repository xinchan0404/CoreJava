package com.xinchan.corejava.ch11.hsp.homework.homework01_hsp;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-27
 */
public class Homework01 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        Thread threadA = new Thread(a);
        threadA.setName("线程A");
        threadA.start();

        ThreadB b = new ThreadB(a);
        Thread threadB = new Thread(b);
        threadB.setName("线程B");
        threadB.start();
    }
}
