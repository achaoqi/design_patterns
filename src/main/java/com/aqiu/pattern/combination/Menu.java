package com.aqiu.pattern.combination;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    private List<MenuComponent> childs;

    public Menu(String name, int level) {
        super(name, level);
        this.childs=new ArrayList<>();
    }

    @Override
    public void print() {
        for(int i=1;i<level;i++){
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent child : childs) {
            child.print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponent.level=this.level+1;
        childs.add(menuComponent);
    }

    @Override
    public void add(MenuComponent... menuComponent) {
        for (MenuComponent component : menuComponent) {
            add(component);
        }
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        childs.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return childs.get(i);
    }
}
