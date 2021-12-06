package com.xinchan.corejava.ch05.abstractClasses;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-02
 */
public class Student extends Person{
    // instance field
    private String major;

    // constructor
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    // methods
    public String getMajor() {
        return major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() +
                ", major=" + getMajor() +
                "}";
    }
}
