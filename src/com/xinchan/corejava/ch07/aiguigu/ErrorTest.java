package com.xinchan.corejava.ch07.aiguigu;

/**
 * Error：JVM 无法解决的问题，内部错误、资源耗尽。
 *
 * 一般不编写针对性的代码进行处理。错了就改代码吧~~
 *
 * @author xinchan
 * @version 1.0.1 2022-01-10
 */
public class ErrorTest {
    public static void main(String[] args) {
        /*
         * 1. 栈溢出：java.lang.StackOverflowError
         */
//        main(args);

        /*
         * 2. 堆溢出：java.lang.OutOfMemoryError
         */
//        int[] array = new int[1024 * 1024 * 1024];
    }
}
