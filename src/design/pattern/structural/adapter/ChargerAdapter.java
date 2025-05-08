package design.pattern.structural.adapter;

public class ChargerAdapter implements USBTypeC {
    private final OldCharger oldCharger;

    public ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeLaptop() {
        System.out.println("Adapter converting USB-A to USB-C...");
        oldCharger.chargeWithUSBA(); // Delegating call to old charger
    }
}

/*🤔 Why Use Adapter Pattern?
✅ Allows compatibility between incompatible interfaces → No need to modify existing code.
✅ Helps reuse existing code → Use old systems with new ones.
✅ Follows Open-Closed Principle → You can extend behavior without modifying existing classes.
✅ Decouples code → The system does not need to know about the old charger’s details.
* */
