package pl.sda.travelagency;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

//@Entity
public class Trip {


    private Destination destination;
    private Departure departure;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private boolean promoted;
    private int duration;
    private int adultSpots;
    private int childrenSpots;
    private double adultPrice;
    private double childrenPrice;
    private Alimentation alimentation;
//    @Id
//    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    public Trip(Destination destination, int duration, double adultPrice, Departure departure) {
        this.destination = destination;
        this.duration = duration;
        this.adultPrice = adultPrice;
        this.departure = departure;
    }

    public Trip() {
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setAdultSpots(int adultSpots) {
        this.adultSpots = adultSpots;
    }

    public void setChildrenSpots(int childrenSpots) {
        this.childrenSpots = childrenSpots;
    }

    public void setAdultPrice(double adultPrice) {
        this.adultPrice = adultPrice;
    }

    public void setChildrenPrice(double childrenPrice) {
        this.childrenPrice = childrenPrice;
    }

    public void setAlimentation(Alimentation alimentation) {
        this.alimentation = alimentation;
    }

    public Destination getDestination() {
        return destination;
    }

    public Departure getDeparture() {
        return departure;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public int getDuration() {
        return duration;
    }

    public int getAdultSpots() {
        return adultSpots;
    }

    public int getChildrenSpots() {
        return childrenSpots;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public double getChildrenPrice() {
        return childrenPrice;
    }

    public Alimentation getAlimentation() {
        return alimentation;
    }
}
