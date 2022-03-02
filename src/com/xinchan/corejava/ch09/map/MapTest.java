package com.xinchan.corejava.ch09.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xinchan
 * @version 1.0.1 2022-03-01
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staffs = new HashMap<>();
        staffs.put("144-25-5464", new Employee("Amy Lee"));
        staffs.put("567-24-2546", new Employee("Harry Hacker"));
        staffs.put("157-62-7935", new Employee("Gary Cooper"));
        staffs.put("456-62-5527", new Employee("Francesca Cruz"));

        System.out.println(staffs);

        staffs.remove("567-24-2546");

        staffs.put("456-62-5527", new Employee("Francesca Miller"));

        System.out.println(staffs.get("456-62-5527"));

        staffs.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
}
