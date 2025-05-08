package design.pattern.structural.composite;

// Another Leaf Node (Designer)
public class Designer implements Employee{
    private final String name;
    private final String role;

    public Designer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void showDetails() {
        System.out.println("Designer: " + name + ", Role: " + role);
    }
}
