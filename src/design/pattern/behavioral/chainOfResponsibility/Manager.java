package design.pattern.behavioral.chainOfResponsibility;

public class Manager extends LeaveApprover{
    @Override
    public void approveLeave(int days) {
        if (days <= 5) {
            System.out.println("Manager approved " + days + " days leave.");
        } else if (nextApprover != null) {
            nextApprover.approveLeave(days);
        }
    }
}
