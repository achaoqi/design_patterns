package com.aqiu.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Waitor {
    private List<Command> orders=new ArrayList<>();

    public void setCommand(Command cmd){
        orders.add(cmd);
    }

    void orderUp(){
        for (Command order : orders) {
            if(order!=null){
                order.execute();
            }
        }
        orders.clear();
    }
}
