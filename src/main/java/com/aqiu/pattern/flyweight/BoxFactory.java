package com.aqiu.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BoxFactory {
    private Map<String,AbstractBox> map;

    private BoxFactory(){
        this.map=new HashMap<>();
        AbstractBox l=new LBox(),i=new IBox(),o=new OBox();
        map.put("l",l);
        map.put("i",i);
        map.put("o",o);
    }

    public static BoxFactory getInstance(){
        return SingletonHolder.factory;
    }

    private static class SingletonHolder{
        private static final BoxFactory factory=new BoxFactory();
    }

    public AbstractBox get(String key){
        return map.get(key);
    }
}
