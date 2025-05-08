package design.pattern.behavioral.state;

// Concrete State: Fan is at HIGH speed
public class HighSpeedState implements FanState{
    @Override
    public void turnNext(Fan fan) {
        fan.setState(new OffState());  // Switch to OFF
        System.out.println("Fan is turned OFF.");
    }

    @Override
    public void showState() {
        System.out.println("Fan is running at HIGH speed.");
    }
}
