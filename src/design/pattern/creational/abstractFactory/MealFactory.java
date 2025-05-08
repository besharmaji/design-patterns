package design.pattern.creational.abstractFactory;

// Abstract Factory (Declares methods for creating product families)
public interface MealFactory {
    Pizza createPizza();
    Drink createDrink();
}
