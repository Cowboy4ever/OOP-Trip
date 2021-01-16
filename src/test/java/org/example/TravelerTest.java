package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelerTest {

    Traveler traveler;

    @Before
    public void setUp() {
        String name = "Eduardo";
        String passPortNo = "12345";
        Double money = 40.00;
        List<Destination> placesVisted = new ArrayList<>();
        placesVisted.add( new Destination("Florida", 1000.0, 0.13, false) );
        boolean noFlyList = false;
        CovidResults covidResults = new CovidResults( new Date(), false );

        traveler = new Traveler(name, passPortNo, money, placesVisted, noFlyList, covidResults);
    }

    @Test
    public void bookATrip() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getPassPortNo() {
    }

    @Test
    public void setPassPortNo() {
    }

    @Test
    public void getMoney() {
    }

    @Test
    public void setMoney() {
    }

    @Test
    public void getPlacesVisited() {
    }

    @Test
    public void setPlacesVisited() {
    }

    @Test
    public void getNoFlyList() {
    }

    @Test
    public void setNoFlyList() {
    }

    @Test
    public void getCovidResults() {
    }

    @Test
    public void setCovidResults() {
    }
}