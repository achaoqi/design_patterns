package diagram.pattern.prototype.framework;

import java.util.HashMap;

public class Manager {
    private HashMap map=new HashMap();

    public void register(String name,Product proto){
        map.put(name,proto);
    }

    public Product create(String name){
        return ((Product)map.get(name)).createClone();
    }
}
