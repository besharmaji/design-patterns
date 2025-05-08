package design.pattern.behavioral.visitor;

public class Book implements Visitable{
    public double price = 50;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
