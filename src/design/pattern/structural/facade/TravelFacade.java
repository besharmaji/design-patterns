package design.pattern.structural.facade;

// Facade (Simplified Interface)
public class TravelFacade {
    private final FlightBooking flight;
    private final HotelBooking hotel;
    private final TaxiBooking taxi;

    public TravelFacade() {
        this.flight = new FlightBooking();
        this.hotel = new HotelBooking();
        this.taxi = new TaxiBooking();
    }

    public void bookCompleteTrip(String destination) {
        System.out.println("\nBooking travel package for " + destination + "...");
        flight.bookFlight(destination);
        hotel.bookHotel(destination);
        taxi.bookTaxi(destination);
        System.out.println("Trip to " + destination + " booked successfully!\n");
    }
}
