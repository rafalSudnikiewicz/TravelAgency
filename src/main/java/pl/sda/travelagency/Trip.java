package pl.sda.travelagency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Trip extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "destination_city")
    private City destinationCity;
    @ManyToOne
    @JoinColumn(name = "departure_city")
    private City departureCity;

    private LocalDate departureDate;
    private LocalDate returnDate;
    private boolean promoted;
    private int duration;
    private int adultSpots;
    private int childrenSpots;
    private BigDecimal adultPrice;
    private BigDecimal childrenPrice;
    @Enumerated(EnumType.STRING)
    private Alimentation alimentation;

    public Trip(City destinationCity, int duration, BigDecimal adultPrice, City departureCity, boolean promoted) {
        this.destinationCity = destinationCity;
        this.duration = duration;
        this.adultPrice = adultPrice;
        this.departureCity = departureCity;
        this.promoted = promoted;
        this.departureDate=LocalDate.now();
        this.returnDate=LocalDate.now();
    }


}
