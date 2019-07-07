package pl.sda.travelagency;

import javax.persistence.Entity;

//@Entity
public class Hotel {
    private String name;
    private City city;
    private int standard;
    private String description;


    public Hotel() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public int getStandard() {
        return standard;
    }

    public String getDescription() {
        return description;
    }
}
