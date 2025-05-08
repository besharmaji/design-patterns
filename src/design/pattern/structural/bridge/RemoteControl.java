package design.pattern.structural.bridge;

// Abstraction - Remote Control
public abstract class RemoteControl {
    protected TV tv; // Bridge to the TV implementation

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    abstract void turnOn();
    abstract void turnOff();
    abstract void setChannel(int channel);
}
