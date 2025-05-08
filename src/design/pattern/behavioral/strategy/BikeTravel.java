package design.pattern.behavioral.strategy;

// Concrete Strategy: Bike Travel
public class BikeTravel implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("Traveling by Bike 🏍");
    }
}
