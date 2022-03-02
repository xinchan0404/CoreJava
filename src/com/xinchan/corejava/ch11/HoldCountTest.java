package com.xinchan.corejava.ch11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xinchan
 * @version 1.0.1 2022-03-02
 */
public class HoldCountTest {
    private ReentrantLock reentrantLock = new ReentrantLock();

    public void test1() {
        reentrantLock.lock();
        try {
            System.out.println("test1()...");
            System.out.println("test1: " + reentrantLock.getHoldCount());
            test2();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void test2() {
        reentrantLock.lock();
        try {
            System.out.println("test2()...");
            System.out.println("test2: " + reentrantLock.getHoldCount());
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args) {
        HoldCountTest holdCountTest = new HoldCountTest();
        holdCountTest.test1();
    }
}
