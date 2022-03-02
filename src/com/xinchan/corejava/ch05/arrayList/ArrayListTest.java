package com.xinchan.corejava.ch05.arrayList;

import com.xinchan.corejava.ch04.EmployeeTest.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-06
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staffs = new ArrayList<>();

        staffs.add(new Employee("zhangsan", 1000, 2021, 11, 6));
        staffs.add(new Employee("lisi", 2000, 2021, 11, 7));
        staffs.add(new Employee("wangwu", 3000, 2021, 11, 8));
        staffs.add(2, new Employee("zhaoliu", 4000, 2021, 11, 6));

        staffs.remove(2);

        for (Employee staff : staffs) {
            System.out.println(staff);
        }
    }
}
