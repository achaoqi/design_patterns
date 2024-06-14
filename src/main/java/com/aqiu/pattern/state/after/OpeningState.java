package com.aqiu.pattern.state.after;

public class OpeningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
