package com.xinchan.collections.collection.list.linkedList;

import com.xinchan.collections.collection.list.Student;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-17
 */
public class StackBasedLinkedList {
    public static void main(String[] args) {
        // 创建集合
        LinkedList<Student> stack = new LinkedList<Student>();

        // 创建集合元素
        Student zhangsan = new Student("zhangsan", 1);
        Student lisi = new Student("lisi", 2);
        Student wangwu = new Student("wangwu", 3);
        Student zhaoliu = new Student("zhaoliu", 4);
        Student qianqi = new Student("qianqi", 5);

        /*
         * （1）LinkedList 用作堆栈-在栈顶添加元素（元素入栈）
         *  常用添加方法
         *      1. 在 Stack 接口中，在栈顶添加元素，抛出异常 push()
         *      2. 在 Deque 接口中，在栈顶添加元素，返回特殊值 addFirst()
         */
        System.out.println("----------（1）LinkedList 用作堆栈-在栈顶添加元素（元素入栈）----------");
        stack.push(zhangsan);
        stack.addFirst(lisi);
        stack.push(wangwu);
        stack.addFirst(zhaoliu);
        System.out.println("元素个数：" + stack.size());
        System.out.println(stack);  // 从栈顶到栈底

        /*
         * （2）LinkedList 用作堆栈-查看栈顶元素
         *  常用查看方法
         *      1. 在 Stack 接口中，查看栈顶元素，抛出异常 peek()
         *      2. 在 Deque 接口中，在栈顶添加元素，返回特殊值 peekFirst()
         */
        System.out.println("----------（2）LinkedList 用作堆栈-查看栈顶元素----------");
        System.out.println("栈顶元素：" + stack.peek());
        System.out.println("栈顶元素：" + stack.peekFirst());

        /*
         * （3）LinkedList 用作堆栈-在栈顶删除元素（元素出栈）
         *  常用删除方法
         *      1. 在 Stack 接口中，在栈顶删除元素，抛出异常 remove()
         *      2. 在 Deque 接口中，在栈顶添加元素，返回特殊值 removeFirst()
         */
        System.out.println("----------（3）LinkedList 用作堆栈-在栈顶删除元素（元素出栈）----------");
        Student[] students = new Student[4];
        students[0] = stack.remove();
        students[1] = stack.removeFirst();
        students[2] = stack.remove();
        students[3] = stack.removeFirst();
        System.out.println("元素个数：" + stack.size());
        System.out.println(Arrays.toString(students));  // 堆栈：先进后出
    }
}
