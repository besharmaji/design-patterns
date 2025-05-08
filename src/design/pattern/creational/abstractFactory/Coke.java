package design.pattern.creational.abstractFactory;

// Concrete product: Coke
public class Coke implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving Coke 🥤");
    }
}
