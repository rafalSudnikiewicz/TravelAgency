package pl.sda.travelagency;

import javax.persistence.Entity;

//@Entity
public class Country {
    private String name;
    private Continent continent;

    public Country() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent() {
        return continent;
    }
}
