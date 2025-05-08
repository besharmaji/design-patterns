package design.pattern.creational.abstractFactory;

// Concrete product: Chicken Burger
public class ChickenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Pizza 🍗🍕");
    }
}
