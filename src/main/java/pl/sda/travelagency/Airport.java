package pl.sda.travelagency;

import javax.persistence.Entity;
import java.util.Set;

//@Entity
public class Airport {
   private String name;
   private Set<City> cities;

   public Airport() {
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setCities(Set<City> cities) {
      this.cities = cities;
   }

   public String getName() {
      return name;
   }

   public Set<City> getCities() {
      return cities;
   }
}
