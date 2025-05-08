package design.pattern.behavioral.mediator;

public interface ATCMediator {
    void registerFlight(Flight flight);
    void setLandingStatus(boolean status);
    boolean isLandingAllowed();
}
