package design.pattern.behavioral.iterator;

import java.util.List;

public class MyBookIterator implements BookIterator{
    private final List<Book> books;
    private int index = 0;

    public MyBookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        return books.get(index++);
    }
}
