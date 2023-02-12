package com.xinchan.test.pattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class Store implements ProductObservable {
    private List<Observer> observers;
    private Map<String, Product> products;

    public Store(List<Observer> observers, Map<String, Product> products) {
        this.observers = observers;
        this.products = products;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void addNewProduct(Product product) {
        this.products.put(product.getName(), product);

        observers.forEach(Observer::onNewProduct);
    }

    public void changeProductPrice(Product product, Double price) {
        this.products.get(product.getName()).setPrice(price);

        observers.forEach(Observer::onPriceChanged);
    }

    public static void main(String[] args) {
        List<Observer> observers = new ArrayList<>();
        Map<String, Product> products = new HashMap<>();

        Store store = new Store(observers, products);

        Product product = new Product("a", 100.0);
        store.addNewProduct(product);
    }
}
