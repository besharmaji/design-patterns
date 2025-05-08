package design.pattern.creational.prototype;

public class Book implements Prototype{
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Implementing clone method
    @Override
    public Prototype clone() {
        return new Book(this.title, this.author);
    }

    public void showBook() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}