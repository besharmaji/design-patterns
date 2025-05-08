package design.pattern.behavioral.template;

// Abstract Class (Template)
public abstract class Beverage {
    // Template method
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();           // to be overridden
    protected abstract void addCondiments();  // to be overridden
}
