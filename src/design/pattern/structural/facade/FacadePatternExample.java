package design.pattern.structural.facade;

public class FacadePatternExample {
    public static void main(String[] args) {
        // Using the facade to book a trip easily
        TravelFacade travel = new TravelFacade();
        travel.bookCompleteTrip("Goa");
    }
}

/*🤔 Why Use Facade Pattern?
✅ Simplifies complex subsystems → One method handles everything.
✅ Reduces dependencies → Clients don’t need to interact with multiple classes.
✅ Increases maintainability → Changes in subsystems won’t affect the client.
✅ Encapsulates complexity → Clients don’t need to understand how subsystems work.
* */
