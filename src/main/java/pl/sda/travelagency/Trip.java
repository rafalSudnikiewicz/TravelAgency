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
public class Trip extends BaseEntity{


    private String destinationCity;
    private String departureCity;
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
    //    @Id
//    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    public Trip(String destinationCity, int duration, BigDecimal adultPrice, String departureCity, boolean promoted) {
        this.destinationCity = destinationCity;
        this.duration = duration;
        this.adultPrice = adultPrice;
        this.departureCity = departureCity;
        this.promoted = promoted;
    }


}
