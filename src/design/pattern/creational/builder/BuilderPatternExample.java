package design.pattern.creational.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Create a custom burger
        Burger myBurger = new Burger.BurgerBuilder()
                .setBun("Sesame")
                .setPatty("Chicken")
                .addCheese(true)
                .addLettuce(true)
                .addTomato(false)
                .build();

        System.out.println(myBurger);
    }
}

/*🤔 Why Use Builder Pattern?
✅ Improves Readability → No need for long constructors.
✅ Prevents Unnecessary Parameters → Only set what you need.
✅ Creates Immutable Objects → Since fields are final after creation.
✅ Step-by-Step Construction → Customize object creation easily.
* */