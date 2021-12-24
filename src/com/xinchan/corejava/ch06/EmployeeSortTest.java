package com.xinchan.corejava.ch06;

import java.util.Arrays;

/**
 * @author xinchan
 * @version 1.0.1 2021-12-07
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staffs = new Employee[3];

        staffs[0] = new Employee("zhangsan", 10000);
        staffs[1] = new Employee("lisi", 25000);
        staffs[2] = new Employee("wangwu", 20000);

        Arrays.sort(staffs);

        for (Employee staff : staffs) {
            System.out.println(staff);
        }
    }
}
