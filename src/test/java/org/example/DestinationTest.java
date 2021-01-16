package org.example;

import org.example.exceptions.InsufficientFundsException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DestinationTest {

    Destination destination;

    @Before
    public void setUp() {
        destination = new Destination("Florida", 1000.0, 0.13, false);
    }

    @Test
    public void allowToVisitIsTrue() {
        List<Destination> placesVisted = new ArrayList<>();
        placesVisted.add(destination);
        CovidResults covidResults = new CovidResults( new Date(), false );
        Traveler traveler = new Traveler("Eduardo", "12345", 400.00,
                placesVisted, false, covidResults);

        destination.allowToVisit(traveler);

        // If no exception is thrown, this test passes.
    }

    @Test(expected = InsufficientFundsException.class)
    public void allowToVisitIsFalse() {
        List<Destination> placesVisted = new ArrayList<>();
        placesVisted.add(destination);
        CovidResults covidResults = new CovidResults( new Date(), false );
        Traveler traveler = new Traveler("Eduardo", "12345", 40.00,
                placesVisted, false, covidResults);

        destination.allowToVisit(traveler);

        // If InsufficientFundsException exception is thrown, this test passes.
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getDistance() {
    }

    @Test
    public void setDistance() {
    }

    @Test
    public void getCostPerMile() {
    }

    @Test
    public void setCostPerMile() {
    }

    @Test
    public void getRequireCovidTest() {
    }

    @Test
    public void setRequireCovidTest() {
    }
}