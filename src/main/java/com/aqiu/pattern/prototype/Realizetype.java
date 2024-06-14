package com.aqiu.pattern.prototype;

public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("具体的原型对象创建成功");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
