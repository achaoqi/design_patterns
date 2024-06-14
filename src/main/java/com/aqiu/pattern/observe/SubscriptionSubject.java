package com.aqiu.pattern.observe;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    private List<Observer> weixinUserList;

    public SubscriptionSubject(){
        this.weixinUserList=new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserList) {
            observer.update(message);
        }
    }
}
