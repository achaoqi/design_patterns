package diagram.pattern.visitor;

import java.util.*;

public class FileFindVisitor extends Visitor{
    private List<File> list=new ArrayList<>();
    private String suffix;

    public FileFindVisitor(String suffix){
        this.suffix=suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)){
            list.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry=(Entry)it.next();
            entry.accept(this);
        }
    }

    public Iterator<File> getFoundFiles(){
        return list.iterator();
    }
}
