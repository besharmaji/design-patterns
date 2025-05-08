package design.pattern.creational.factory;

// Concrete classes (Different types of Pizzas)
public class ChickenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Pizza 🍗🍕");
    }
}
