package design.pattern.structural.decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Start with a simple coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " -> ₹" + myCoffee.getCost());

        // Add Milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " -> ₹" + myCoffee.getCost());

        // Add Whipped Cream
        myCoffee = new WhippedCreamDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " -> ₹" + myCoffee.getCost());

    }
}

/*🤔 Why Use Decorator Pattern?
✅ Adds new functionality dynamically → No need to modify existing classes.
✅ Follows Open/Closed Principle → Existing classes remain unchanged, but we can extend their behavior.
✅ Avoids subclass explosion → Instead of creating multiple subclasses like MilkCoffee, SugarMilkCoffee, etc., we decorate the object at runtime.

💡 Simple Rule: If you want to dynamically add features to an object without modifying its original class, the Decorator Pattern is the best fit! 🚀
* */