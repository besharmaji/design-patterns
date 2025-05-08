package design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private final String name;
    private final String department;
    private final List<Employee> team;  // Stores employees under this manager

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
        this.team = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        team.add(emp);
    }

    public void removeEmployee(Employee emp) {
        team.remove(emp);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Department: " + department);
        System.out.println("Team:");
        for (Employee emp : team) {
            emp.showDetails();  // Calls showDetails() for each employee in the team
        }
    }
}
