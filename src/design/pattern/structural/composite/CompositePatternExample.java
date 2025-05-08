package design.pattern.structural.composite;

public class CompositePatternExample {
    public static void main(String[] args) {
        // Create individual employees
        Employee dev1 = new Developer("Alice", "Backend Developer");
        Employee dev2 = new Developer("Bob", "Frontend Developer");
        Employee designer1 = new Designer("Charlie", "UI/UX Designer");

        // Create a manager and assign employees
        Manager manager1 = new Manager("David", "Development");
        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);
        manager1.addEmployee(designer1);

        // Create another manager
        Manager generalManager = new Manager("Eve", "Tech Department");
        generalManager.addEmployee(manager1); // Manager managing another manager

        // Display employee details
        System.out.println("Company Structure:");
        generalManager.showDetails();
    }
}

/*🤔 Why Use Composite Pattern?
✅ Treats individual and group objects the same way → No special handling for groups.
✅ Easier to add new components → Just add a new Employee type (like Tester, HR, etc.).
✅ Flexible hierarchy → You can have multiple levels of management.
✅ Reduces complexity → No need for complex if-else conditions to check object types.
* */