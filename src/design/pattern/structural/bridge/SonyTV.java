package design.pattern.structural.bridge;

// Concrete Implementor 1 - Sony TV
public class SonyTV implements TV{
    @Override
    public void turnOn() {
        System.out.println("Sony TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV is OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sony TV: Channel set to " + channel);
    }
}
