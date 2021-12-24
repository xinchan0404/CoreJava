package com.xinchan.corejava.ch06;

/**
 * @author xinchan
 * @version 1.0.1 2021-12-07
 */
public class Employee implements Comparable<Employee>{
    /*
     * instance field
     */
    private String name;
    private double salary;

    /*
     * constructor
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /*
     * methods
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getSalary(double byPercent) {
        this.salary += salary * byPercent / 100;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
