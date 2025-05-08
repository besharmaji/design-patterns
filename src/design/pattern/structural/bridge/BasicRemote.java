package design.pattern.structural.bridge;

// Concrete Abstraction 1 - Basic Remote
public class BasicRemote extends RemoteControl{
    public BasicRemote(TV tv) {
        super(tv);
    }

    @Override
    void turnOn() {
        tv.turnOn();
    }

    @Override
    void turnOff() {
        tv.turnOff();
    }

    @Override
    void setChannel(int channel) {
        tv.setChannel(channel);
    }
}
