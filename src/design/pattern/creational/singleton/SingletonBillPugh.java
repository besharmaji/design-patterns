package design.pattern.creational.singleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {}

    private static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}

/*🤔 Bill Pugh Singleton (Best & Recommended)
✅ Uses static inner class to achieve lazy initialization without synchronization overhead.
✅ Most efficient Singleton implementation.
✅ Thread-Safe
✅ Efficient & Lazy Initialization
* */


/*🤔 Why Use Singleton Pattern?
✅ Ensures a Single Instance → Prevents multiple objects from being created.
✅ Saves Memory → Especially useful for heavy objects like database connections.
✅ Thread-Safe Implementations Available → Prevents race conditions.
✅ Global Access Point → Provides a centralized way to access shared resources.
* */