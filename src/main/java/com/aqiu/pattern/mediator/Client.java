package com.aqiu.pattern.mediator;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        Tenant tenant = new Tenant("李四", mediator);
        HouseOwner owner = new HouseOwner("张三", mediator);

        mediator.setOwner(owner);
        mediator.setTenant(tenant);
        tenant.constact("需要租三室的房子");
        owner.constact("我这有三室的房子，你需要租吗？");
    }
}
