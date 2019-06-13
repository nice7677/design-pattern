package kr.springboot.interator;

public class BookShelfIterator implements Iterator {

    @Override
    public boolean hasNext() {
        if (index < bookshelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookshelf.getBookAt(index);
        index++;
        return book;
    }

    private Bookshelf bookshelf;
    private int index;

    public BookShelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }
}
