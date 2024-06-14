package com.aqiu.pattern.singleton.demo2;

public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }
}
