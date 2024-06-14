package com.aqiu.pattern.mediator;

public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message,this);
    }

    public void getMessage(String message){
        System.out.printf("房主:%s 获取到的信息:%s\n",name,message);
    }
}
