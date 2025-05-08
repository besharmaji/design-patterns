package design.pattern.structural.proxy;

public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");

        // First time: Image will be loaded from disk
        image.display();

        // Second time: Image will not be loaded again
        image.display();
    }
}

/*🤔 Why Use Proxy Pattern?
✅ Lazy Initialization (Virtual Proxy) → Loads an object only when needed (saves memory).
✅ Security (Protection Proxy) → Restricts access to sensitive objects.
✅ Logging & Access Control (Logging Proxy) → Keeps track of method calls.
✅ Caching (Smart Proxy) → Stores frequently used data to avoid expensive operations.
* */
