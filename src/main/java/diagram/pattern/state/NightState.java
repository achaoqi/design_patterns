package diagram.pattern.state;

public class NightState implements State{

    private static NightState nightState=new NightState();
    private NightState(){}

    public static NightState getInstance(){
        return nightState;
    }
    @Override
    public void doClock(Context context, int hour) {
        if (hour>=9&&hour<17){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急，晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警报（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
