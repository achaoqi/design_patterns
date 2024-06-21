package diagram.pattern.proxy;

public class PrintProxy implements Printable{
    private String name;
    private Printer real;

    public PrintProxy(String name) {
        this.name=name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        this.name=name;
        if(real!=null){
            real.setPrinterName(name);
        }
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize(){
        if(real==null){
            real=new Printer(name);
        }
    }
}
