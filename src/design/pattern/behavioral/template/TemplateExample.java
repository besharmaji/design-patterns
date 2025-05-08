package design.pattern.behavioral.template;

public class TemplateExample {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepare();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepare();
    }
}

/*🤔 Why Use Template Method?
✅ Defines the skeleton of an algorithm in a base class, but lets subclasses customize specific steps
✅ Promotes code reuse and avoids duplication
✅ Ensures consistent algorithm structure, but still allows flexibility
✅ Follows the Hollywood Principle: “Don’t call us, we’ll call you.” – the base class calls the child’s code
* */
