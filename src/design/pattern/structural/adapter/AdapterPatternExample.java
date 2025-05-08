package design.pattern.structural.adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        // Old charger that is not directly compatible
        OldCharger oldCharger = new OldCharger();

        // Using an adapter to make it compatible
        USBTypeC adapter = new ChargerAdapter(oldCharger);

        // Charging the laptop
        adapter.chargeLaptop();
    }
}

/*🤔 Why Use Adapter Pattern?
✅ Allows incompatible interfaces to work together.
✅ Useful when integrating legacy or third-party code.
✅ Promotes reusability without modifying existing code.
✅ Helps follow the Open/Closed Principle (extend behavior without changes).
* */