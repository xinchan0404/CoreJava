package com.xinchan.corejava.ch05.abstractClasses;

import java.util.List;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-02
 */
public class PersonTest {
    public static void main(String[] args) {
        // create a Person array
        Person[] people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("zhangsan", 1000, 2021, 11, 2);
        people[1] = new Student("zhengxin", "IT");

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println(people[0].getClass());
    }
}
