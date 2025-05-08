package design.pattern.creational.singleton;

public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked instance;

    private SingletonDoubleChecked() {}

    public static SingletonDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (instance == null) { // Double-check to ensure only one instance
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}

/*🤔 Double-Checked Locking (Thread-Safe & Performance Optimized)
✅ Uses volatile to prevent multiple object creation.
✅ Ensures lazy initialization without performance issues.
✅ Thread-Safe
✅ Better Performance
* */

