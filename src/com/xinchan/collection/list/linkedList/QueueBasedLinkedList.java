package com.xinchan.collection.list.linkedList;

import com.xinchan.collection.list.Student;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 测试 LinkedList 作为 Queue 和 Stack 使用
 * @author zegxn
 * @version 1.0.1 2021-11-17
 */
public class QueueBasedLinkedList {
    public static void main(String[] args) {
        // 创建集合
        LinkedList<Student> queue = new LinkedList<>();

        // 创建集合元素
        Student zhangsan = new Student("zhangsan", 1);
        Student lisi = new Student("lisi", 2);
        Student wangwu = new Student("wangwu", 3);
        Student zhaoliu = new Student("zhaoliu", 4);
        Student qianqi = new Student("qianqi", 5);

        /*
         * （1）LinkedList 用作队列-从尾部添加元素
         *  常用添加方法
         *      1. Queue 接口中，在尾部添加元素，抛出异常 add()
         *      2. Queue 接口中，在尾部添加元素，返回特殊值 offer()
         *      3. Deque 接口中，在尾部添加元素，抛出异常 addLast()
         *      4. Deque 接口中，在尾部添加元素，返回特殊值 offerLast()
         */
        System.out.println("----------（1）LinkedList 用作队列-从尾部添加元素----------");
        queue.add(zhangsan);
        queue.offer(lisi);
        queue.addLast(wangwu);
        queue.offerLast(zhaoliu);
        System.out.println("元素个数：" + queue.size());
        System.out.println(queue);

        /*
         * （2）LinkedList 用作队列-查看队列头部元素
         *  常用查看方法
         *      1. 在 Queue 接口中，查看队列头部元素，抛出异常 element()
         *      2. 在 Queue 接口中，查看队列头部元素，返回特殊值 peek()
         *      3. 在 Deque 接口中，查看队列头部元素，抛出异常 getFirst()
         *      4. 在 Deque 接口中，查看队列头部元素，返回特殊值 peekFirst()
         */
        System.out.println("----------（2）LinkedList 用作队列-查看队列头部元素----------");
        System.out.println("队列头部元素：" + queue.element());
        System.out.println("队列头部元素：" + queue.peek());
        System.out.println("队列头部元素：" + queue.getFirst());
        System.out.println("队列头部元素：" + queue.peekFirst());

        /*
         * （3）LinkedList 用作队列-从头部删除元素
         *  常用删除方法
         *      1. 在 Queue 接口中，在头部删除元素，抛出异常 remove()
         *      2. 在 Queue 接口中，在头部删除元素，返回特殊值 poll()
         *      3. Deque 接口中，在头部删除元素，抛出异常 removeFirst()
         *      4. Deque 接口中，在头部删除元素，返回特殊值 pollFirst()
         */
        System.out.println("----------（3）LinkedList 用作队列-从头部删除元素----------");
        Student[] student = new Student[4];
        student[0] = queue.remove();
        student[1] = queue.poll();
        student[2] = queue.removeFirst();
        student[3] = queue.pollFirst();
        System.out.println("元素个数：" + queue.size());
        System.out.println(Arrays.toString(student));  // 队列：先进先出
    }
}
