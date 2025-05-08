package design.pattern.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {} // Private constructor

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy(); // Created only when needed
        }
        return instance;
    }
}

/*🤔 Lazy Initialization (Not Thread-Safe)
✅ Instance is created only when needed.
❌ Downside: Not thread-safe in a multithreaded environment.
❌ Not Thread-Safe (Multiple threads may create multiple instances)
* */
