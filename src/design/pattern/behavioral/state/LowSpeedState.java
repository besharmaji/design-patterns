package design.pattern.behavioral.state;

// Concrete State: Fan is at LOW speed
public class LowSpeedState implements FanState{
    @Override
    public void turnNext(Fan fan) {
        fan.setState(new HighSpeedState());  // Switch to High Speed
        System.out.println("Fan turned to HIGH speed.");
    }

    @Override
    public void showState() {
        System.out.println("Fan is running at LOW speed.");
    }
}
