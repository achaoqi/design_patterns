package com.aqiu.pattern.responsibility;

public class Manager extends Handler{
    public Manager(){
        super(NUM_ONE,NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假,"+leave.getNum()+"天,"+leave.getContent());
        System.out.println("部门经理审批");
    }
}
