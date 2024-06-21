package diagram.pattern.proxy;

public class Client {
    public static void main(String[] args) {
        PrintProxy p = new PrintProxy("Alice");
        System.out.println("现在的名字是:"+p.getPrinterName()+".");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是:"+p.getPrinterName()+".");
        p.print("Hello,world");
    }
}
