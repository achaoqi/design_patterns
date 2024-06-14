package com.aqiu.pattern.combination;

public abstract class MenuComponent {
    protected String name;
    protected int level;

    public String getName() {
        return name;
    }

    public MenuComponent(String name,int level){
        this.name=name;
        this.level=level;
    }

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent... menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
