package design.pattern.creational.abstractFactory;

// Concrete product: Veg Pizza
public class VegPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza 🍕");
    }
}
