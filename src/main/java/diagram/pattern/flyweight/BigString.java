package diagram.pattern.flyweight;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string){
        bigChars=new BigChar[string.length()];
        for (int i = 0; i < string.length(); i++) {
            bigChars[i]=BigCharFactory.getInstance().getBigChar(string.charAt(i));
        }
    }

    public void print(){
        for (BigChar bigChar : bigChars) {
            bigChar.print();
        }
    }
}
