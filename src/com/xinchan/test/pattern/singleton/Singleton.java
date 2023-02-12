package com.xinchan.test.pattern.singleton;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {}

    public Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

class Singleton_ {
    private Singleton_() {}

    private static class SingletonHolder {
        private static final Singleton_ INSTANCE = new Singleton_();
    }

    public Singleton_ getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
