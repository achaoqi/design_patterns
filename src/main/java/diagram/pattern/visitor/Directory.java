package diagram.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
    private String name;
    private ArrayList<Entry> dir=new ArrayList<>();

    public Directory(String name){
        this.name=name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int sum=0;
        for (Entry entry : dir) {
            sum+=entry.getSize();
        }
        return sum;
    }

    @Override
    public Entry add(Entry entry) throws Exception {
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator iterator(){
        return dir.iterator();
    }
}
