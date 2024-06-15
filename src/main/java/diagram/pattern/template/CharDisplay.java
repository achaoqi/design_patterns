package diagram.pattern.template;

public class CharDisplay extends AbstractDisplay{
    private char ar;

    public CharDisplay(char ar){
        this.ar=ar;
    }
    @Override
    void open() {
        System.out.print("<<");
    }

    @Override
    void print() {
        System.out.print(ar);
    }

    @Override
    void close() {
        System.out.println(">>");
    }
}
