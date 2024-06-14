package com.aqiu.pattern.responsibility;

public abstract class Handler {
    protected final static int NUM_ONE=1;
    protected final static int NUM_THREE=3;
    protected final static int NUM_SEVEN=7;

    private int numStart;
    private int numEnd;

    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handlerLeave(LeaveRequest leave);

    public final void submit(LeaveRequest leave){
        if (leave.getNum()<this.numStart) return;
        if(leave.getNum()<=this.numEnd){
            this.handlerLeave(leave);
            System.out.println("流程结束!");
        }else if(this.nextHandler!=null&&leave.getNum()>this.numEnd){
            this.nextHandler.submit(leave);
        }
    }
}
