package design.pattern.behavioral.state;

// State Interface
public interface FanState {
    void turnNext(Fan fan);  // Moves to the next state
    void showState();
}
