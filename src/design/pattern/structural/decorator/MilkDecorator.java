package design.pattern.structural.decorator;

// Concrete Decorator: Adding Milk
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;  // Adding Milk costs extra ₹10
    }
}
