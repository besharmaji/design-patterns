package design.pattern.structural.bridge;

public class BridgePatternExample {
    public static void main(String[] args) {

        TV sony = new SonyTV();
        TV samsung = new SamsungTV();

        RemoteControl basicRemoteSony = new BasicRemote(sony);
        RemoteControl advancedRemoteSamsung = new AdvancedRemote(samsung);

        basicRemoteSony.turnOn();
        basicRemoteSony.setChannel(5);
        basicRemoteSony.turnOff();

        System.out.println();

        advancedRemoteSamsung.turnOn();
        advancedRemoteSamsung.setChannel(10);
        ((AdvancedRemote) advancedRemoteSamsung).mute();
        advancedRemoteSamsung.turnOff();
    }
}

/*🤔 Why Use Bridge Pattern?
✅ Decouples abstraction (Remote) from implementation (TVs).
✅ Supports multiple variations independently (Remotes & TVs evolve separately).
✅ Reduces the number of subclasses (avoids class explosion).
✅ Increases maintainability & scalability.
* */