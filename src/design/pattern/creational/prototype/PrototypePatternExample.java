package design.pattern.creational.prototype;

public class PrototypePatternExample {
    public static void main(String[] args) {
        // Create an original book
        Book originalBook = new Book("Design Patterns", "GoF");

        // Clone the book
        Book clonedBook = (Book) originalBook.clone();

        // Display books
        originalBook.showBook();
        clonedBook.showBook();
    }
}

/*🤔 Why Use Prototype Pattern?
✅ Improves Performance → Cloning is faster than creating new objects from scratch.
✅ Reduces Complexity → Avoids repeated initialization logic.
✅ Flexible & Scalable → New objects can be created dynamically at runtime.
✅ Avoids Subclassing → Instead of creating multiple subclasses, clone an existing object.
* */
