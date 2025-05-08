package design.pattern.behavioral.chainOfResponsibility;

// Concrete Handler: Team Lead
class TeamLead extends LeaveApprover {
    @Override
    public void approveLeave(int days) {
        if (days <= 2) {
            System.out.println("Team Lead approved " + days + " days leave.");
        } else if (nextApprover != null) {
            nextApprover.approveLeave(days); // Forward request
        }
    }
}
