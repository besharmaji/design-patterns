package design.pattern.creational.abstractFactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        // Order a Veg Meal
        MealFactory vegFactory = new VegMealFactory();
        Pizza vegPizza = vegFactory.createPizza();
        Drink coke = vegFactory.createDrink();

        vegPizza.prepare();
        coke.serve();

        // Order a Non-Veg Meal
        MealFactory nonVegFactory = new NonVegMealFactory();
        Pizza chickenPizza = nonVegFactory.createPizza();
        Drink pepsi = nonVegFactory.createDrink();

        chickenPizza.prepare();
        pepsi.serve();
    }
}

/*🤔 Why Use Abstract Factory Pattern?
✅ Creates families of related objects without specifying their concrete classes.
✅ Ensures consistency among related products (e.g., UI components with the same theme).
✅ Promotes scalability — easy to switch between product families (e.g., Windows vs. Mac UI).
✅ Maintains high-level abstraction — client code depends only on interfaces, not implementations.
* */
