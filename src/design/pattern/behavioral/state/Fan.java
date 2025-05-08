package design.pattern.behavioral.state;

// Context: Fan
public class Fan {
    private FanState state;

    public Fan() {
        state = new OffState();  // Initial state is OFF
    }

    public void setState(FanState state) {
        this.state = state;
    }

    public void pressButton() {
        state.turnNext(this);
    }

    public void showState() {
        state.showState();
    }
}
