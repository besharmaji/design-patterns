package design.pattern.structural.bridge;

// Implementor - Defines the TV behavior
public interface TV {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
}
