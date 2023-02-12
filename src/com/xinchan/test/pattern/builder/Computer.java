package com.xinchan.test.pattern.builder;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class Computer {
    private String name;
    private Integer age;
    private String sex;

    private Computer(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public static class Builder {
        private String name;
        private Integer age;
        private String sex;

        public Builder() {}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                                        .setName("zhengxin")
                                        .setAge(25)
                                        .setSex("male")
                                        .build();
        System.out.println(computer);
    }
}
