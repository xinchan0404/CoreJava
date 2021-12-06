package com.xinchan.corejava.ch04.EmployeeTest;

/**
 * This program tests my first class Employee
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staffs = new Employee[3];

        staffs[0] = new Employee("zhangsan", 1000, 2021, 10, 1);
        staffs[1] = new Employee("lisi", 2000, 2021, 10, 2);
        staffs[2] = new Employee("wangwu", 3000, 2021, 10, 3);

        // raise everyone's salary by 5%
        for (Employee staff : staffs) {
            staff.raiseSalary(5);
        }

        // print out info about all Employee objects
        for (Employee staff : staffs) {
            System.out.println(staff);
        }
    }
}
