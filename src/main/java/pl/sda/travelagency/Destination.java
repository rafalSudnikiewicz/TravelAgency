package pl.sda.travelagency;

import javax.persistence.Entity;

//@Entity
public class Destination {
    private City city;
    private Hotel hotel;
    private Airport airport;

    public Destination(City city) {
        this.city = city;
    }

    public Destination() {
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public City getCity() {
        return city;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Airport getAirport() {
        return airport;
    }
}
