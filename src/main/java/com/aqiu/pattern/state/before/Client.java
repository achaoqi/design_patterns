package com.aqiu.pattern.state.before;

public class Client {
    public static void main(String[] args) {
        Lift lift=new Lift();
        lift.setState(ILift.OPENING_STATE);
        lift.close();
    }
}
