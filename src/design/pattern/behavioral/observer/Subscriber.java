package design.pattern.behavioral.observer;

// Observer Interface (All subscribers must implement this)
public interface Subscriber {
    void update(String videoTitle);
}
