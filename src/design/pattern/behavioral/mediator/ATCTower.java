package design.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ATCTower implements ATCMediator{
    private final List<Flight> flights = new ArrayList<>();
    private boolean landingStatus = true; // true means landing is allowed


    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.landingStatus = status;
    }

    @Override
    public boolean isLandingAllowed() {
        return landingStatus;
    }
}
