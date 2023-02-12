package com.xinchan.test.pattern.observer;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class Observer {
    private String name;
    private Integer age;
    private String address;
    private String sex;

    public void onNewProduct() {
        System.out.println("New Product......");
    }

    public void onPriceChanged() {
        System.out.println("Price Changed......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
