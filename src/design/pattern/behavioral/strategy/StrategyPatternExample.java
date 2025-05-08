package design.pattern.behavioral.strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        TravelContext context = new TravelContext();

        // Choosing to travel by Car
        context.setTravelStrategy(new CarTravel());
        context.startJourney();

        // Switching to Bike
        context.setTravelStrategy(new BikeTravel());
        context.startJourney();
    }
}

/*🤔 Why Use This Pattern?
✅ Removes if-else conditions (No need to check if(car) {} or if(bus) {} everywhere).
✅ Easily extendable (Add a new travel mode like "Train" 🚆and Bus 🚌 without modifying existing code).
✅ More flexible (Change behavior at runtime).

💡 Simple Rule: If you need to switch between multiple behaviors dynamically, Strategy Pattern is the best fit! 🚀
* */