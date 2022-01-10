package com.xinchan.corejava.ch07.aiguigu;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * java.lang.Throwable
 *      |------ java.lang.Error：一般不编写针对性代码进行处理。
 *      |------ java.lang.Exception：需要重点关注和处理的异常
 *          |------ 检查型异常、编译时异常（checked）
 *              |------ IOException
 *                  |------ FileNotFoundException
 *              |------ ClassNotFoundException
 *          |------ 非检查型异常、运行时异常（unchecked）
 *              |------ NullPointerException
 *              |------ IndexOutOfBoundsException
 *              |------ ClassCastException
 *              |------ InputMismatchException
 *              |------ ArithmeticException
 *
 *
 * @author xinchan
 * @version 1.0.1 2022-01-10
 */
public class ExceptionTest {
    /*
     * 编译时异常、检查型异常
     */
    // IOException：无法通过编译
    @Test
    public void test() {
//        File file = new File("hello.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//
//        int data = fileInputStream.read();
//        while (data != -1) {
//            System.out.println((char) data);
//            data = fileInputStream.read();
//        }
//
//        fileInputStream.close();
    }


    /*
     * 运行时异常、非检查型异常
     */
    // NullPointerException
    @Test
    public void test1() {
//        int[] array = null;
//        System.out.println(array[0]);

        String s = null;
        System.out.println(s.charAt(0));
    }

    // ArrayIndexOutOfBoundsException
    @Test
    public void test2() {
//        int[] array = new int[3];
//        System.out.println(array[3]);

        String s = "abc";
        System.out.println(s.charAt(3));
    }

    // ClassCastException
    @Test
    public void test3() {
        Object obj = new Date();
        String s = (String) obj;
    }

    // InputMismatchException
    @Test
    public void test4() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age);

        scanner.close();
    }

    // ArithmeticException
    @Test
    public void test5() {
        int a = 10 / 0;
        System.out.println(a);
    }
}
