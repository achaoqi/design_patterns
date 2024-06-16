package diagram.pattern.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton i1 = Singleton.getInstance();
        Singleton i2 = Singleton.getInstance();
        System.out.println(i1==i2);
    }
}
