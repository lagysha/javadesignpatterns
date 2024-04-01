package org.example.structural.facade;

import com.ibm.icu.util.LocaleData;
import java.util.Collections;
import java.util.List;

public class TravelFacade {
    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    {
        hotelBooker = new HotelBooker();
        flightBooker = new FlightBooker();
    }

    public List<TravelRoute> getTravelRoutes(LocaleData from, LocaleData to){
        List<Flight> flights = flightBooker.getFlightFor(from,to);
        List<Hotel> hotels = hotelBooker.getHotelsFor(from,to);
        return Collections.emptyList();
    }

    public void bookTravelRoute(TravelRoute travelRoute){
        hotelBooker.bookHotel(travelRoute.getHotel());
        flightBooker.bookFlight(travelRoute.getFlight());
    }
}
