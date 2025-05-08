package design.pattern.structural.decorator;

// Concrete Decorator: Adding Whipped Cream
public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15;  // Adding Whipped Cream costs extra ₹15
    }
}
