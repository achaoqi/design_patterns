package diagram.pattern.template;

public class Client {
    public static void main(String[] args) {
        AbstractDisplay display1=new CharDisplay('a');
        AbstractDisplay display2=new StringDisplay("Hello,world!");
        display1.display();
        display2.display();
    }
}
