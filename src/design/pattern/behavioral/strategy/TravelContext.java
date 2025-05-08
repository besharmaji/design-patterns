package design.pattern.behavioral.strategy;

// Context class (chooses which strategy to use)
public class TravelContext {
    TravelStrategy strategy;

    // Set travel strategy dynamically
    public void setTravelStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    // Execute the selected strategy
    public void startJourney() {
        if (strategy == null) {
            throw new IllegalStateException("Travel strategy not set!");
        }
        strategy.travel();
    }
}
