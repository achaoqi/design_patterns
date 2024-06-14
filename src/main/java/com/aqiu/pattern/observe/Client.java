package com.aqiu.pattern.observe;

public class Client {
    public static void main(String[] args) {
        Subject subject=new SubscriptionSubject();
        subject.attach(new WeixinUser("chaoqi"));
        subject.attach(new WeixinUser("guanjia"));

        subject.notify("cnm");
    }
}
