package pl.sda.travelagency;

import javax.persistence.Entity;

//@Entity
public class Departure {
    private City city;
    private Airport airport;

    public Departure() {
    }

    public Departure(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
