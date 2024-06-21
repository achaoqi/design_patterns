package diagram.pattern.proxy;

public class Printer implements Printable{
    private String name;
    public Printer(){
        System.out.println("==="+name+"===");
        heavyJob("Printer 实例生成中");
    }

    public Printer(String name) {
        this.name=name;
        heavyJob("Printer实例生成中("+name+")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name=name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("==="+name+"===");
        System.out.println(string);
    }

    void heavyJob(String msg){
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println("结束。");
    }
}
