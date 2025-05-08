package design.pattern.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Setting up the chain
        LeaveApprover teamLead = new TeamLead();
        LeaveApprover manager = new Manager();
        LeaveApprover director = new Director();

        teamLead.setNextApprover(manager);  // TeamLead → Manager
        manager.setNextApprover(director);  // Manager → Director

        // Test different leave requests
        teamLead.approveLeave(1);   // Should be approved by Team Lead
        teamLead.approveLeave(4);   // Should be approved by Manager
        teamLead.approveLeave(7);   // Should be approved by Director
        teamLead.approveLeave(15);  // Should be rejected
    }
}

/*🤔 Why Use Chain of Responsibility Pattern?
✅ Decouples request senders and receivers → Client doesn’t need to know who handles the request.
✅ Flexible and scalable → You can add new handlers (e.g., HR approval) without modifying existing code.
✅ Avoids if-else clutter → No giant if-else chains in the code.
* */
