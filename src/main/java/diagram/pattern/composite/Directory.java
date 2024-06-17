package diagram.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry{
    private String name;
    private List<Entry> directory=new ArrayList<>();

    public Directory(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int sum=0;
        for (Entry next : directory) {
            sum += next.getSize();
        }
        return sum;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+name);
        for (Entry next : directory) {
            next.printList(prefix + "/" + name);
        }
    }

    @Override
    public Entry add(Entry entry) throws Exception {
        directory.add(entry);
        return this;
    }
}
