package design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyBookCollection implements BookCollection{
    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public BookIterator iterator() {
        return new MyBookIterator(books);
    }
}
