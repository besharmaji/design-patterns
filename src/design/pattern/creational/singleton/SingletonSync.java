package design.pattern.creational.singleton;

public class SingletonSync {
    private static SingletonSync instance;

    private SingletonSync() {}

    public static synchronized SingletonSync getInstance() {
        if (instance == null) {
            instance = new SingletonSync();
        }
        return instance;
    }
}

/*🤔 Thread-Safe Singleton using Synchronized Method
✅ Uses synchronized keyword to ensure only one thread can access it.
❌ Downside: Every call to getInstance() is slow due to synchronization.
✅ Thread-Safe
❌ Performance Issue (Every call to getInstance() is synchronized)
* */
