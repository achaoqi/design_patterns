package diagram.pattern.iterator;

public class BookShelf implements Aggregate{

    private Book[] books;
    private int last;

    public BookShelf(int maxSize){
        this.books=new Book[maxSize];
        last=0;
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        books[last++]=book;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    private static class BookShelfIterator implements Iterator{
        private BookShelf bookShelf;
        private int index;

        public BookShelfIterator(BookShelf bookShelf){
            this.bookShelf=bookShelf;
            this.index=0;
        }


        @Override
        public boolean hasNext() {
            return index< bookShelf.getLength();
        }

        @Override
        public Object next() {
            return bookShelf.getBookAt(index++);
        }
    }
}
