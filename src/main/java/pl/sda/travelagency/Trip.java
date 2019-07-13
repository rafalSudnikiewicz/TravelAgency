package pl.sda.travelagency;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

//@Entity
@Getter
@Setter
@NoArgsConstructor
public class Trip {


    private City destinationCity;
    private City departureCity;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private boolean promoted;
    private int duration;
    private int adultSpots;
    private int childrenSpots;
    private BigDecimal adultPrice;
    private BigDecimal childrenPrice;
    private Alimentation alimentation;
    //    @Id
//    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    public Trip(City destinationCity, int duration, BigDecimal adultPrice, City departureCity) {
        this.destinationCity = destinationCity;
        this.duration = duration;
        this.adultPrice = adultPrice;
        this.departureCity = departureCity;
    }


}
