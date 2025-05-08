package design.pattern.creational.factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        // Client code just asks for a pizza
        Pizza vegPizza = PizzaFactory.getPizza("veg");
        assert vegPizza != null;
        vegPizza.prepare();

        Pizza chickenPizza = PizzaFactory.getPizza("chicken");
        assert chickenPizza != null;
        chickenPizza.prepare();
    }
}

/*🤔 Why Use Factory Pattern?
✅ Encapsulates object creation logic → The client doesn’t need to know how objects are created.
✅ Easy to add new products → Just add a new class and update the factory.
✅ Decouples object creation → Client only interacts with the factory, not with specific classes.
* */
