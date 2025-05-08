package design.pattern.behavioral.state;

public class StatePatternExample {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.showState();  // Fan is OFF
        fan.pressButton();  // Turns to LOW speed
        fan.showState();

        fan.pressButton();  // Turns to HIGH speed
        fan.showState();

        fan.pressButton();  // Turns OFF again
        fan.showState();
    }
}

/*🤔 Why Use State Pattern?
✅ Avoids messy if-else logic → Each state is in its own class.
✅ Easier to add new states → Just add a new class instead of modifying existing code.
✅ Improves maintainability → Each state handles its own behavior.
* */