package design.pattern.creational.abstractFactory;

// Concrete Factory: Non-Veg Meal Factory
public class NonVegMealFactory implements MealFactory{
    @Override
    public Pizza createPizza() {
        return new ChickenPizza();
    }

    @Override
    public Drink createDrink() {
        return new Pepsi();
    }
}
