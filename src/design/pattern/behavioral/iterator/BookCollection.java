package design.pattern.behavioral.iterator;

public interface BookCollection {
    void addBook(Book book);
    BookIterator iterator();
}
