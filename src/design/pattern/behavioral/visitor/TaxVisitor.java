package design.pattern.behavioral.visitor;

public class TaxVisitor implements Visitor{
    @Override
    public void visit(Book book) {
        double tax = book.price * 0.10;
        System.out.println("Book tax: ₹" + tax);
    }

    @Override
    public void visit(Fruit fruit) {
        double tax = fruit.pricePerKg * fruit.weight * 0.05;
        System.out.println("Fruit tax: ₹" + tax);
    }
}
