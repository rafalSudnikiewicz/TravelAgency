package pl.sda.travelagency;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TripDTO {
    private Long destinationCityId;
    private Long departureCityId;
    private String departureDate;
    private String returnDate;
    private boolean promoted;
    private Integer duration;
    private Integer adultSpots;
    private Integer childrenSpots;
    private BigDecimal adultPrice;
    private BigDecimal childrenPrice;
    private String alimentation;


}
