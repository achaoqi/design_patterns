package com.aqiu.pattern.singleton.demo7;

public class Singleton {
    private static boolean flag=false;
    private Singleton(){
        synchronized (Singleton.class){
            if(flag){
                throw new RuntimeException();
            }
            flag=true;
        }
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
