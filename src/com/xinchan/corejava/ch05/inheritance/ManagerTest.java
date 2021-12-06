package com.xinchan.corejava.ch05.inheritance;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-02
 */
public class ManagerTest {
    public static void main(String[] args) {
        // create a Manager object
        Manager boss = new Manager("zhengxin", 3000, 2021, 11, 1);
        boss.setBonus(500);

        // create Employee object array
        Employee[] staffs = new Employee[3];

        staffs[0] = boss;
        staffs[1] = new Employee("zhangsan", 2000, 2021, 11, 2);
        staffs[2] = new Employee("lisi", 1000, 2021, 11, 3);

        for (Employee staff : staffs) {
            System.out.println(staff);
        }
    }
}
