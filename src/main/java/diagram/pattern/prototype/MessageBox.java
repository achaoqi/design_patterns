package diagram.pattern.prototype;

import diagram.pattern.prototype.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar){
        this.decochar=decochar;
    }

    @Override
    public void use(String s) {
        int len=s.length();
        for(int i=0;i<len+4;i++) System.out.print(decochar);
        System.out.println();
        System.out.printf("%c %s %c\n",decochar,s,decochar);
        for(int i=0;i<len+4;i++) System.out.print(decochar);
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p=null;
        try{
            p=(Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
