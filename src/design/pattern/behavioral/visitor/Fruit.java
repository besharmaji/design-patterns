package design.pattern.behavioral.visitor;

public class Fruit implements Visitable{
    public double weight = 2; // in kg
    public double pricePerKg = 30;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
