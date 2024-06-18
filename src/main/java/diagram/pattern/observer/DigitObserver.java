package diagram.pattern.observer;

public class DigitObserver implements Observer{

    @Override
    public void update(NumberGeneration generation) {
        System.out.println("DigitObserver:"+generation.getNumber());
        try{
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
