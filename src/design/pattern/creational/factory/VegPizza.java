package design.pattern.creational.factory;

// Concrete classes (Different types of Pizzas)
public class VegPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza 🍕");
    }
}
