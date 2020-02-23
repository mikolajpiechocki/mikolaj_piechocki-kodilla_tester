package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private KindOfFlight kindOfFlight;
    private String city;
    private String numberOfFly;

    public Flight(KindOfFlight kindOfFlight, String city, String numberOfFly) {
        this.kindOfFlight = kindOfFlight;
        this.city = city;
        this.numberOfFly = numberOfFly;
    }

    public KindOfFlight getKindOfFlight() {
        return kindOfFlight;
    }

    public String getCity() {
        return city;
    }

    public String getNumberOfFly() {
        return numberOfFly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(kindOfFlight, flight.kindOfFlight) &&
                Objects.equals(city, flight.city) &&
                Objects.equals(numberOfFly, flight.numberOfFly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kindOfFlight, city, numberOfFly);
    }
}
