package design.pattern.creational.singleton;

public enum SingletonEnum {
    INSTANCE; // Enum guarantees a single instance

    public void showMessage() {
        System.out.println("Hello from SingletonEnum!");
    }
}

/*🤔 Enum Singleton (Best for Serialization & Reflection Safe)
✅ Prevents serialization issues (Java ensures only one instance of an enum).
✅ Prevents reflection attacks.
✅ Thread-Safe
✅ Serialization & Reflection Safe
✅ Best for Singletons that don't require additional logic
* */
