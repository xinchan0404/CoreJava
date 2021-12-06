package com.xinchan.corejava.ch04.ParamTest;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class ParamTest {
    public static void main(String[] args) {
        /*
         * Test 1: Methods can't modify numeric parameters
         */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
         * Test 2: Methods can change the state of the object parameter
         */
        System.out.println("\nTesting tripleValue:");
        Employee e = new Employee("zhangsan", 1000);
        System.out.println("Before: salary=" + e.getSalary());
        tripleSalary(e);
        System.out.println("After: salary=" + e.getSalary());

        /*
         * Test 3: Methods can't attach new objects to object parameter (Java is "call by value")
         */
        System.out.println("\nTest swap:");
        Employee a = new Employee("zhangsan", 1000);
        Employee b = new Employee("lisi", 2000);
        System.out.println("Before: a=" + a);
        System.out.println("Before: b=" + b);
        swap(a, b);
        System.out.println("After: a=" + a);
        System.out.println("After: b=" + b);
    }

    public static void tripleValue(double x) {
        x *= 3;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee tmp = x;
        x = y;
        y = tmp;
        System.out.println("End of method: x=" + x);
        System.out.println("End of method: y=" + y);
    }
}