package diagram.pattern.strategy;

public class Hand {
    public static final int HANDVALUE_GUN=0;
    public static final int HANDVALUE_CHO=1;
    public static final int HANDVALUE_PAA=2;

    public static final Hand[] hand={
            new Hand(HANDVALUE_GUN),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private static final String[] name={"石头","剪刀","布"};

    private int handValue;

    private Hand(int handValue){
        this.handValue=handValue;
    }
    public static Hand getHand(int handValue){
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h){
        return fight(h)==1;
    }

    public boolean isWeakThan(Hand h){
        return fight(h)==-1;
    }

    private int fight(Hand h){
        if(h==this) return 0;
        if((this.handValue+1)%3==h.handValue){
            return 1;
        }
        return -1;
    }

    public String getName(){
        return name[this.handValue];
    }
}
