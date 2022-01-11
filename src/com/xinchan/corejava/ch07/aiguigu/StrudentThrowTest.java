package com.xinchan.corejava.ch07.aiguigu;

/**
 * @author xinchan
 * @version 1.0.1 2022-01-11
 */
public class StrudentThrowTest {
    private int id;
    private String name;

    public StrudentThrowTest(int id, String name) throws XinchanException{
        if (id >= 0) {
            this.id = id;
        } else {
            throw new XinchanException("输入数据格式错误~~");
        }
        if (name != null) {
            this.name = name;
        } else {
            throw new XinchanException("输入数据格式错误~~");
        }
    }

    @Override
    public String toString() {
        return "StrudentThrowTest{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        try {
            StrudentThrowTest student1 = new StrudentThrowTest(10, "");
            StrudentThrowTest student2 = new StrudentThrowTest(-10, "xinchan");

            System.out.println(student1);
            System.out.println(student2);
        } catch (XinchanException e) {
            System.out.println(e.getMessage());
        }
    }
}
