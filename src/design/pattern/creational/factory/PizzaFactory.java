package design.pattern.creational.factory;

// Factory class (Responsible for creating pizza objects)
public class PizzaFactory {
    public static Pizza getPizza(String type) {
        if (type.equalsIgnoreCase("veg")) {
            return new VegPizza();
        } else if (type.equalsIgnoreCase("chicken")) {
            return new ChickenPizza();
        }
        return null;
    }
}
