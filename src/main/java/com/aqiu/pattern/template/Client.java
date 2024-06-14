package com.aqiu.pattern.template;

public class Client {
    public static void main(String[] args) {
        AbstractClass baocai=new ConcreteClass_BaoCai();
        baocai.cookProcess();
        AbstractClass caixin=new ConcreteClass_CaiXin();
        caixin.cookProcess();
    }
}
