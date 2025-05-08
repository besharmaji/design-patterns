package design.pattern.structural.bridge;

// Concrete Abstraction 2 - Advanced Remote with extra functionality
public class AdvancedRemote extends RemoteControl{
    public AdvancedRemote(TV tv) {
        super(tv);
    }

    @Override
    void turnOn() { tv.turnOn(); }

    @Override
    void turnOff() {
        tv.turnOff();
    }

    @Override
    void setChannel(int channel) {
        tv.setChannel(channel);
    }

    void mute() {
        System.out.println("TV is Muted");
    }
}
