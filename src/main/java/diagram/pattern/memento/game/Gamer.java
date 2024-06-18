package diagram.pattern.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits=new ArrayList<>();
    private Random random=new Random();
    private static String[] fruitsName={
            "苹果","葡萄","香蕉","橘子"
    };
    public Gamer(int money){
        this.money=money;
    }

    public int getMoney() {
        return money;
    }

    public void bet(){
        int dict=random.nextInt(6)+1;
        switch (dict){
            case 1:
                money+=100;
                System.out.println("金钱增加了");
                break;
            case 2:
                money/=2;
                System.out.println("金钱减半了");
                break;
            case 6:
                String f = getFruit();
                System.out.printf("获得了水果(%s)\n",f);
                fruits.add(f);
                break;
            default:
                System.out.println("什么都没有发生");
        }
    }

    private String getFruit(){
        String prefix="";
        if (random.nextBoolean()){
            prefix="好吃的";
        }
        return prefix+fruitsName[random.nextInt(fruitsName.length)];
    }

    public Memento createMemento(){
        Memento m = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("好吃的"))
                m.addFruits(fruit);
        }
        return m;
    }

    public void restoreMemento(Memento memento){
        this.fruits=memento.getFruits();
        this.money= memento.money;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                ", random=" + random +
                '}';
    }
}
