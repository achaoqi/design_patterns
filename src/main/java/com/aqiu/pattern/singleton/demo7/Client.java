package com.aqiu.pattern.singleton.demo7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Singleton> aClass = Singleton.class;
        Constructor<Singleton> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton = constructor.newInstance();
        System.out.println(singleton==Singleton.getInstance());
    }
}
