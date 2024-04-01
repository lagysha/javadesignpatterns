package org.example.structural.facade;

import java.util.Date;

public class Flight {

    private String flightNumber;
    private String airportNumber;
    private String airportTo;
    private Date departureDateTime;

    public String getAirportNumber() {
        return airportNumber;
    }

    public void setAirportNumber(String airportNumber) {
        this.airportNumber = airportNumber;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
