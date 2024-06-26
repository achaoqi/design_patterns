package diagram.pattern.prototype;

import diagram.pattern.prototype.framework.Manager;
import diagram.pattern.prototype.framework.Product;

public class Client {
    public static void main(String[] args) {
        Manager manager=new Manager();
        UnderlinePen upen=new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message",upen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);

        Product p1 = manager.create("strong message");
        Product p2 = manager.create("warning box");
        Product p3 = manager.create("slash box");

        p1.use("Hello,world!");
        p2.use("Hello,world!");
        p3.use("Hello,world!");
    }
}
