package com.aqiu.pattern.mediator;

public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message,this);
    }

    public void getMessage(String message){
        System.out.printf("租房者:%s 获取到的信息:%s\n",name,message);
    }
}
