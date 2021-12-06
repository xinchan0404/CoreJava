package com.xinchan.corejava.ch05.abstractClasses;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-02
 */
public abstract class Person {
    private String name;
    public abstract String getDescription();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                "}";
    }
}
