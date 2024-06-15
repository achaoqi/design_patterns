package diagram.pattern.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        PrintBanner banner = new PrintBanner(new Banner("chaoqi"));
        banner.printStrong();
        banner.printWeek();
    }
}
