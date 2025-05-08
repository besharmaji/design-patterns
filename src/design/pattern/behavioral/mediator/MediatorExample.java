package design.pattern.behavioral.mediator;

public class MediatorExample {
    public static void main(String[] args) {
        ATCMediator atc = new ATCTower();

        Flight flight1 = new Airplane(atc, "Indigo-101");
        Flight flight2 = new Airplane(atc, "SpiceJet-202");

        flight1.getReady();
        flight1.land();

        flight2.getReady();
        flight2.land(); // Should wait

        // Once flight1 lands, ATC clears runway
        atc.setLandingStatus(true); // Simulate flight1 cleared the runway
        flight2.land(); // Now it can land
    }
}

/*🤔 Why Use Mediator Pattern?
✅ Centralizes communication → Components don't talk to each other directly, they talk via a mediator.
✅ Reduces tight coupling → Classes stay independent and reusable, making the system easier to maintain.
✅ Simplifies complex object interaction → Great for UI frameworks, chat rooms, air traffic control systems, etc.
✅ Promotes Single Responsibility Principle → Components focus on their own job, the mediator handles coordination.
✅ Makes code more flexible → You can change how components interact without touching the components themselves.
* */