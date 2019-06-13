package kr.springboot.interator;

public class Main {

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(4);
        bookshelf.appendBook(new Book("무인도에서 살아남기"));
        bookshelf.appendBook(new Book("북극에서 살아남기"));
        bookshelf.appendBook(new Book("남극에서 살아남기"));
        bookshelf.appendBook(new Book("한국에서 살아남기"));
//        bookshelf.appendBook(new Book("일본에서 살아남기"));
//        Index 넘어가면 ArrayIndexOutOfBoundsException
        Iterator iterator = bookshelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }

}
