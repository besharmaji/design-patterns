package design.pattern.behavioral.mediator;

public class Airplane implements Flight{
    private final ATCMediator atcMediator;
    private final String flightName;

    public Airplane(ATCMediator atcMediator, String flightName) {
        this.atcMediator = atcMediator;
        this.flightName = flightName;
        atcMediator.registerFlight(this);
    }

    @Override
    public void land() {
        if (atcMediator.isLandingAllowed()) {
            System.out.println(flightName + " is landing...");
            atcMediator.setLandingStatus(false); // runway now occupied
        } else {
            System.out.println(flightName + " waiting to land...");
        }
    }

    @Override
    public void getReady() {
        System.out.println(flightName + " is ready for landing.");
    }
}
