package com.aqiu.pattern.responsibility;

public class GroupLeader extends Handler{

    public GroupLeader(){
        super(0,NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假,"+leave.getNum()+"天,"+leave.getContent());
        System.out.println("小组长审批");
    }
}
