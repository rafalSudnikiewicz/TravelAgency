package pl.sda.travelagency;

import javax.persistence.Entity;

//@Entity
public class City {
    private String name;
    private Country country;
    private Airport airport;

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public Airport getAirport() {
        return airport;
    }
}
