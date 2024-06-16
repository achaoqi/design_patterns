package diagram.pattern.prototype;

import diagram.pattern.prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar){
        this.ulchar=ulchar;
    }

    @Override
    public void use(String s) {
        System.out.printf("\"%s\"\n",s);
        for(int i=0;i<s.length()+2;i++) System.out.print(ulchar);
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
