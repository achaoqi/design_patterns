package diagram.pattern.adapter.object_adapter;

public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(Banner banner){
        this.banner=banner;
    }

    @Override
    void printWeek() {
        this.banner.showWithParen();
    }

    @Override
    void printStrong() {
        this.banner.showWithAster();
    }
}
