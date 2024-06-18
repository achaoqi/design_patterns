package diagram.pattern.observer;

import java.util.Random;

public class RandomNumberGeneration extends NumberGeneration{
    private Random random=new Random();
    private int number;

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number=random.nextInt(20);
            notifyServers();
        }
    }
}
