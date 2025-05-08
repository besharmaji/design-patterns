package design.pattern.creational.singleton;

public class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager(); // Eagerly initialized

    private SingletonEager() {} // Private constructor

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}

/*🤔 Eager Initialization (Simple but Memory Wasteful)
✅ Instance is created at class loading.
❌ Downside: Object is created even if not needed.
✅ Thread-Safe
❌ Unnecessary memory usage if the instance is never used
* */
