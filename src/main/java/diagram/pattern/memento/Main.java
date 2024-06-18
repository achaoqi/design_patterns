package diagram.pattern.memento;

import diagram.pattern.memento.game.Gamer;
import diagram.pattern.memento.game.Memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("=== "+i);
            System.out.println("当前状态："+gamer);
            gamer.bet();
            System.out.println("所持金钱为 "+gamer.getMoney()+"元。");
            if (gamer.getMoney() > memento.getMoney()){
                System.out.println("金钱增加了，保存进度");
                memento=gamer.createMemento();
            }else if (gamer.getMoney()< memento.getMoney()){
                System.out.println("金钱减少了，恢复进度");
                gamer.restoreMemento(memento);
            }
            Thread.sleep(100);
            System.out.println();
        }
    }
}
