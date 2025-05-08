package design.pattern.behavioral.iterator;

public class IteratorExample {
    public static void main(String[] args) {
        MyBookCollection collection = new MyBookCollection();

        collection.addBook(new Book("Clean Code"));
        collection.addBook(new Book("Design Patterns"));
        collection.addBook(new Book("Effective Java"));

        BookIterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book: " + book.getTitle());
        }
    }
}

/*🤔 Why Use Iterator Pattern?
✅ Provides a uniform way to traverse different collections (lists, sets, trees) without exposing their internal structure.
✅ Promotes clean separation of concerns → Collection handles data storage, iterator handles traversal.
✅ Supports multiple simultaneous traversals → You can have multiple iterators over the same collection.
✅ Makes custom data structures iterable → You can design your own class and still loop over it using Iterator.
✅ Enables flexibility → You can change how the collection is stored internally without affecting iteration logic.
* */
