package design.pattern.structural.decorator;

// Concrete Component (Simple Coffee)
public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 50; // Base price
    }
}
