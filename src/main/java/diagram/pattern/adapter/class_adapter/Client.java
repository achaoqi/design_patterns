package diagram.pattern.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        PrintBanner banner = new PrintBanner("chaoqi");
        banner.showWithAster();
        banner.showWithParen();
    }
}
