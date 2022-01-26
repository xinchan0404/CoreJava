package com.xinchan.corejava.ch11.kuang;

/**
 * 狂神说-多线程详解-创建线程-练习：龟兔赛跑
 * @author xinchan
 * @version 1.0.1 2022-01-10
 */
public class RunningRace implements Runnable{
    /*
     * instance field
     */
    private static int STEPS = 100;
    private String winner;
    private boolean gameOver;

    /*
     * default constructor
     */
    public RunningRace() {

    }

    /**
     * 判断当前线程是否已达重点——100步，更新比赛状态——是否结束
     * @param steps 当前线程的已跑步数
     * @return
     */
    private void gameOver(int steps) {
        if (gameOver) {
            return;
        }
        if (steps == STEPS) {
            winner = Thread.currentThread().getName();
            gameOver = true;
            System.out.println("winner is " + winner);
        }
    }

    @Override
    public void run() {
        for (int i = 1; i <= STEPS; i++) {
            /*
             * 模拟兔子休息
             */
            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            gameOver(i);  // 检查并更新当前比赛状态
            if (gameOver) {
                break;
            }
            System.out.println("[" + Thread.currentThread().getName() + "] " + "已经跑了 " + i + " 步~~");
        }
    }

    public static void main(String[] args) {
        RunningRace running = new RunningRace();

        new Thread(running, "乌龟").start();
        new Thread(running, "兔子").start();
    }
}
