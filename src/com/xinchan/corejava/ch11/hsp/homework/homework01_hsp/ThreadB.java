package com.xinchan.corejava.ch11.hsp.homework.homework01_hsp;

import java.util.Scanner;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-27
 */
public class ThreadB implements Runnable{
    private Scanner scanner;
    private ThreadA a;

    public ThreadB(ThreadA a) {
        scanner = new Scanner(System.in);
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入您的指令（Q 表示退出）");
            if (scanner.next().toUpperCase().charAt(0) == 'Q') {
                a.setLoop(false);
                break;
            }
        }
    }
}
