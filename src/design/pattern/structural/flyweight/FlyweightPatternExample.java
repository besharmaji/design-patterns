package design.pattern.structural.flyweight;

public class FlyweightPatternExample {
    private static final String[] colors = {"Red", "Blue", "Green", "Yellow", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setPosition(getRandomX(), getRandomY(), 10);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

/*🤔 Why Use Flyweight Pattern?
✅ Optimizes Memory Usage → Reduces duplicate object creation.
✅ Enhances Performance → Reuses shared objects instead of new allocations.
✅ Encapsulates Shared State → Keeps intrinsic (shared) and extrinsic (dynamic) data separate.
✅ Used in Graphics, UI, Caching, and Game Development 🚀
* */
