package design.pattern.behavioral.strategy;

// Concrete Strategy: Car Travel
public class CarTravel implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("Traveling by Car 🚗");
    }
}
