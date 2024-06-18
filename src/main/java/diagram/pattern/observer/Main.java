package diagram.pattern.observer;

public class Main {
    public static void main(String[] args) {
        NumberGeneration generation=new RandomNumberGeneration();
        GraphObserver graphObserver = new GraphObserver();
        DigitObserver digitObserver = new DigitObserver();
        generation.addServers(graphObserver);
        generation.addServers(digitObserver);

        generation.execute();
    }
}
