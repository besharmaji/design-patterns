package design.pattern.creational.abstractFactory;

// Concrete Factory: Veg Meal Factory
public class VegMealFactory implements MealFactory{
    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }

    @Override
    public Drink createDrink() {
        return new Coke();
    }
}
