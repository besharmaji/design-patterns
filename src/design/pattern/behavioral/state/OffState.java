package design.pattern.behavioral.state;

// Concrete State: Fan is OFF
public class OffState implements FanState{
    @Override
    public void turnNext(Fan fan) {
        fan.setState(new LowSpeedState());  // Switch to Low Speed
        System.out.println("Fan turned to LOW speed.");
    }

    @Override
    public void showState() {
        System.out.println("Fan is OFF.");
    }
}
