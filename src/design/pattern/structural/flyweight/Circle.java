package design.pattern.structural.flyweight;

public class Circle implements Shape{
    private final String color; // Intrinsic state (shared)
    private int x, y, radius; // Extrinsic state (set dynamically)

    public Circle(String color) {
        this.color = color;
    }

    public void setPosition(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle - Color: " + color + ", x: " + x + ", y: " + y + ", Radius: " + radius);
    }
}
