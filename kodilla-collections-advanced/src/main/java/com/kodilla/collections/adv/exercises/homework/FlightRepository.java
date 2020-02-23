package com.kodilla.collections.adv.exercises.homework;


import java.util.*;

public class FlightRepository {
    Map<String, List<Flight>> flightsTable = new HashMap<>();

    public void addFlight(String numberOfFly, Flight flight) {
        List<Flight> flights = flightsTable.getOrDefault(numberOfFly, new ArrayList<>());
        flights.add(flight);
        flightsTable.put(numberOfFly, flights);
    }

    public List<Flight> getFlightsNumber(String numberOfFly) {
        return flightsTable.getOrDefault(numberOfFly, Collections.emptyList());
    }

    public List<Flight> getFlightsCity(String city) {
        List<Flight> result = new ArrayList<>();
        return flightsTable.getOrDefault(city, Collections.emptyList());
    }

    public List<Flight> getFlightsArrivals(KindOfFlight kindOfFlight) {
        return flightsTable.getOrDefault(KindOfFlight.ARRIVALS, Collections.emptyList());
    }

    public List<Flight> getFlightsDepartures(KindOfFlight kindOfFlight) {
        return flightsTable.getOrDefault(KindOfFlight.DEPARTURES, Collections.emptyList());
    }

    public int size() {
        return flightsTable.size();
    }
}
