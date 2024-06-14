package com.aqiu.pattern.mediator;

public class MediatorStructure extends Mediator{
    private HouseOwner owner;
    private Tenant tenant;

    public HouseOwner getOwner() {
        return owner;
    }

    public void setOwner(HouseOwner owner) {
        this.owner = owner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if (person==owner){
            tenant.getMessage(message);
        }else{
            owner.getMessage(message);
        }
    }
}
