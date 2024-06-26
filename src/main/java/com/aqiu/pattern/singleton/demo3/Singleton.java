package com.aqiu.pattern.singleton.demo3;

public class Singleton {
    private Singleton(){

    }

    private static Singleton instance=null;

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
