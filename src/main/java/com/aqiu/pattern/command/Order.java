package com.aqiu.pattern.command;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int diningTable;
    private Map<String,Integer> foodDir=new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,int num) {
        foodDir.put(name,num);
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }
}
