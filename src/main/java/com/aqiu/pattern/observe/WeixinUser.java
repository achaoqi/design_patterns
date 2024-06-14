package com.aqiu.pattern.observe;

public class WeixinUser implements Observer{

    private String name;

    public WeixinUser(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s收到信息%s\n",name,message);
    }
}
