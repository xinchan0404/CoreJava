package com.xinchan.test.pattern.factory;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class CarFactory {
    public static Car CreateCar(String name) {
        if (name.equals("A")) {
            return new CarA();
        } else if (name.equals("B")) {
            return new CarB();
        } else {
            throw new RuntimeException("parameter error");
        }
    }

    public static void main(String[] args) {
        String name = "C";
        Car car = CarFactory.CreateCar(name);
        car.run();
    }
}
