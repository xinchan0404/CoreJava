package com.xinchan.corejava.ch04.PackageTest;

import java.time.LocalDate;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class PackageTest {
    public static void main(String[] args) {
        Employee[] staffs = new Employee[3];
        staffs[0] = new Employee("zhengsan", 1000, 2021, 10, 1);
        staffs[1] = new Employee("lisi", 2000, 2021, 10, 2);
        staffs[2] = new Employee("wangwu", 3000, 2021, 10, 3);

        for (Employee e : staffs) {
            System.out.println(e);
        }
    }
}

class Employee {
    // instance field
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    public Employee() {

    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    // methods

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent;
        this.salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", hireDay=" + hireDay + '}';
    }
}
