package com.aqiu.pattern.state.after;

public class Context {
    public static final OpeningState openingState=new OpeningState();
    public static final RunningState runningState=new RunningState();
    public static final ClosingState closingState=new ClosingState();
    public static final StoppingState stoppingState=new StoppingState();

    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void open(){
        liftState.open();
    }

    public void close(){
        liftState.close();
    }

    public void run(){
        liftState.run();
    }

    public void stop(){
        liftState.stop();
    }
}
