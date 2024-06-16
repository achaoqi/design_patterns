package diagram.pattern.factory;

import diagram.pattern.factory.IDCard.IDCardFactory;
import diagram.pattern.factory.framework.Factory;
import diagram.pattern.factory.framework.Product;

public class Client {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("张三");
        Product card2 = factory.create("李四");
        Product card3 = factory.create("王五");

        card1.use();
        card2.use();
        card3.use();
    }
}
