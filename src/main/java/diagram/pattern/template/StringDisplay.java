package diagram.pattern.template;

public class StringDisplay extends AbstractDisplay{
    private String string;
    private int width;

    public StringDisplay(String string){
        this.string=string;
        this.width=string.length();
    }

    @Override
    void open() {
        printLine();
    }

    @Override
    void print() {
        System.out.printf("|%s|\n",string);
    }

    @Override
    void close() {
        printLine();
    }

    void printLine(){
        System.out.print("+");
        for(int i=0;i<width;i++) System.out.print("-");
        System.out.println("+");
    }
}
