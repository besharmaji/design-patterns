package design.pattern.structural.decorator;

// Abstract Decorator (Wraps Coffee objects)
public abstract class CoffeeDecorator implements Coffee{
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
