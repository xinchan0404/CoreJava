package com.xinchan.collection.list.linkedList;

import com.xinchan.collection.list.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-16
 */
public class LinkedListTest {
    public static void main(String[] args) {
        // 创建集合
        LinkedList<Student> students = new LinkedList<>();

        // 创建集合元素
        Student zhangsan = new Student("zhangsan", 1);
        Student lisi = new Student("lisi", 2);
        Student wangwu = new Student("wangwu", 3);
        Student zhaoliu = new Student("zhaoliu", 4);
        Student qianqi = new Student("qianqi", 5);

        /*
         * （1）添加元素
         *  常用 add 方法：
         *      1. 在末尾添加 add(E element)
         *      2. 在指定位置添加 add(int index, E element)
         *      3. 在头部添加 addFirst(E element)
         *      4. 在末尾添加 addLast(E element)
         *      5. 在中间位置添加
         */
        System.out.println("----------（1）添加元素----------");
        students.add(lisi);

        ListIterator<Student> listIterator = students.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.add(wangwu);
        }

        students.add(2, zhaoliu);

        students.addFirst(zhangsan);
        students.addLast(qianqi);
        students.addLast(qianqi);
        students.addLast(qianqi);
        System.out.println("元素个数：" + students.size());
        System.out.println(students);

        /*
         * （2）遍历集合
         */
        System.out.println("----------（2）遍历集合----------");
        System.out.println("----------（2）遍历集合（普通 for）----------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("----------（2）遍历集合（增强 for）----------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------（2）遍历集合（迭代器 iterator）----------");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------（2）遍历集合（列表迭代器 listIterator）----------");
        listIterator = students.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        /*
         * （3）删除元素
         *  常用 remove 方法：
         *      1. 删除头部第一个元素 remove()
         *      2. 删除指定位置元素 remove(int index)
         *      3. 删除指定元素 remove(Object obj)
         *      4. 删除头部第一个元素 removeFirst()
         *      5. 删除尾部第一个元素 removeLast()
         *      6. 删除第一次出现的指定元素 removeFirstOccurrence(Object obj)
         *      7. 删除最后一次出现的指定元素 removeLastOccurrence(Object obj)
         */
        System.out.println("----------（3）删除元素----------");
        students.remove();
        students.remove(0);
        students.remove(wangwu);
        students.removeLast();
        students.removeFirstOccurrence(qianqi);
        students.removeLastOccurrence(qianqi);
        System.out.println("元素个数：" + students.size());
        System.out.println(students);

        /*
         * （4）判断集合
         */
        System.out.println("----------（4）判断集合----------");
        System.out.println("集合中是否存在 zhaoliu：" + students.contains(new Student("zhaoliu", 4)));
        System.out.println("集合是否为空：" + students.isEmpty());

        /*
         * （5）查找元素
         *  常用查找 indexOf 方法
         *      1. 查找指定对象第一次出现的位置
         *      2. 查找指定对象最后一次出现的位置
         */
        System.out.println("----------（5）查找元素----------");
        System.out.println("zhaoliu 第一次出现的位置：" + students.indexOf(zhaoliu));
        System.out.println("zhaoliu 最后一次出现的位置：" + students.lastIndexOf(zhaoliu));
    }
}
