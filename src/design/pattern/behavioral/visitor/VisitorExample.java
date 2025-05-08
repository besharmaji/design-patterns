package design.pattern.behavioral.visitor;

public class VisitorExample {
    public static void main(String[] args) {
        Visitable book = new Book();
        Visitable fruit = new Fruit();

        Visitor taxCalculator = new TaxVisitor();

        book.accept(taxCalculator);
        fruit.accept(taxCalculator);
    }
}

/*🤔 Why Use Visitor Pattern?
✅ Separates algorithms from the objects on which they operate → You can add new operations without changing existing classes.
✅ Follows Open/Closed Principle → Add behavior without modifying existing structure.
✅ Useful for object structures with many classes (e.g., AST, file system, document processors).
✅ Makes operations like reporting, exporting, auditing easy to plug in.
✅ Keeps your data model classes clean and focused only on data.
* */