package com.xinchan.test.pattern.observer;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public interface ProductObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
