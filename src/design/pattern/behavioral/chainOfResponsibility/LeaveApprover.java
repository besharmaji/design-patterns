package design.pattern.behavioral.chainOfResponsibility;

// Abstract Handler
abstract class LeaveApprover {
    protected LeaveApprover nextApprover;  // Next handler in the chain

    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveLeave(int days);
}
