package com.aqiu.pattern.singleton.demo6;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public Object readResolve(){
        return getInstance();
    }
}
