package diagram.pattern.visitor;

import java.util.Iterator;

public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws Exception {
        throw new Exception();
    }

    public Iterator iterator() throws Exception {
        throw new Exception();
    }

    @Override
    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
