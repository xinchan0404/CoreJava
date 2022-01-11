package com.xinchan.corejava.ch07.aiguigu;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一、异常处理：抓抛模型
 *
 * “抛”：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个包含异常信息的异常类对象。并将此对象抛出。
 *      一旦抛出对象后，发生异常处后的代码将不再执行
 *
 * “抓”：异常的两种处理方式： ① try-catch-finally    ② throws
 *
 * 二、try-catch-finally 处理方式
 * 1. 方式一 try-catch-finally - 知道如何处理，直接捕获
 * try {
 *     // code that might throw exceptions
 * } catch (ExceptionType1 e) {
 *     // deal with the exception
 * } catch (ExceptionType2 e) {
 *     // deal with the exception
 * } catch (ExceptionType3 e) {
 *     // deal with the exception
 * } finally {
 *     // close resources
 * }
 *
 * 2. 方式二  “throws + 异常类型" - 不知道如何处理，继续上抛
 * “throws + 异常类型" 写在方法的声明处，指出此方法调用过程中可能会抛出的异常类型。
 *  一旦方法体执行过程中，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足 throws 后的异常类型时，就会被抛出。
 *
 *
 * @author xinchan
 * @version 1.0.1 2022-01-11
 */
public class CatchExceptionTest {
    /*
     * NullPointerException
     */
    @Test
    public void test1() {
        try {
            String s = null;
            System.out.println(s.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("出现了 NullPointerException 异常~~");
        }
        System.out.println("异常已经被处理，剩下的程序还能正常执行~~");
    }

    /*
     * ArithmeticException
     */
    @Test
    public void test2() {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("出现了 ArithmeticException 异常~~");
        }
        System.out.println("异常已经被处理，剩余程序可以继续执行~~");
    }

    /*
     * IOException - unchecked
     */
    @Test
    public void test3() {
        File file = new File("./cache/hello1.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("出现 FileNotFoundException 异常，文件没有找到~~");
        } catch (IOException e) {
            System.out.println("出现了 IOException 异常~~");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * IOException - unchecked
     */
    @Test
    public void test4() throws IOException, FileNotFoundException {
        File file = new File("./cache/hello1.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int data;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }

        fileInputStream.close();
    }

    @Test
    public void test5() throws IOException, FileNotFoundException{
        test4();
    }

    @Test
    public void test6() {
        try {
            test4();
        } catch (FileNotFoundException e) {
            System.out.println("出现了 FileNotFoundException 异常~~");
        } catch (IOException e) {
            System.out.println("出现了 IOException 异常~~");
        } finally {
            System.out.println("异常已经被处理，程序可以继续运行~~");
        }
    }
}
