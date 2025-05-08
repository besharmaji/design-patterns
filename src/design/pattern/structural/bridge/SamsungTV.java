package design.pattern.structural.bridge;

public class SamsungTV implements TV{
    @Override
    public void turnOn() {
        System.out.println("Samsung TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV is OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Samsung TV: Channel set to " + channel);
    }
}
