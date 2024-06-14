package com.aqiu.pattern.state.before;

public interface ILift {
    //电梯的4个状态
    //开门状态
    public final static int OPENING_STATE = 1;
    //关门状态
    public final static int CLOSING_STATE = 2;
    //运行状态
    public final static int RUNNING_STATE = 3;
    //停止状态
    public final static int STOPPING_STATE = 4;

    public void setState(int i);

    public void open();
    public void close();
    public void run();
    public void stop();
}
