package com.aqiu.pattern.flyweight;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color){
        System.out.printf("形状:%s 颜色:%s\n",getShape(),color);
    }
}
