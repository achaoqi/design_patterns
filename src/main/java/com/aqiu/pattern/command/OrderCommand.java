package com.aqiu.pattern.command;

import java.util.Map;

public class OrderCommand implements Command{
    private SeniorChef receive;
    private Order order;

    public OrderCommand(SeniorChef receive, Order order) {
        this.receive = receive;
        this.order = order;
    }

    @Override
    public void execute() {
        for (Map.Entry<String, Integer> entry : order.getFoodDir().entrySet()) {
            String name=entry.getKey();
            int num= entry.getValue();
            receive.makeFood(name,num);
        }
        System.out.println(order.getDiningTable()+"桌饭已经准备好了");
    }
}
