package design.pattern.behavioral.chainOfResponsibility;

public class Director extends LeaveApprover{
    @Override
    public void approveLeave(int days) {
        if (days <= 10) {
            System.out.println("Director approved " + days + " days leave.");
        } else {
            System.out.println("Leave request for " + days + " days is REJECTED.");
        }
    }
}
