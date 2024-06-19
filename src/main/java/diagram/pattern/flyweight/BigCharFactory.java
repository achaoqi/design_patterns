package diagram.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private static BigCharFactory factory=new BigCharFactory();

    private BigCharFactory(){}

    public static BigCharFactory getInstance(){
        return factory;
    }

    private Map<String,BigChar> pool=new HashMap<>();

    public synchronized BigChar getBigChar(char charname){
        BigChar bigChar= pool.get(String.valueOf(charname));
        if (bigChar==null){
            bigChar=new BigChar(charname);
            pool.put(""+charname,bigChar);
        }
        return bigChar;
    }
}
