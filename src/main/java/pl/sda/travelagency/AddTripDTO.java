package pl.sda.travelagency;

import lombok.*;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddTripDTO {
   @NotNull(message = "can't be empty!")
    private Long destinationCityId;
    @NotNull (message = "can't be empty!")
    private Long departureCityId;
    @NotNull (message = "can't be empty!")
  //  @Pattern(regexp = "^[1-9]", message = "accepted decimal number")
    @Digits(integer=6, fraction=2, message = "value must be a number!")
    private BigDecimal adultPrice;
    @Digits(integer=6, fraction=0, message = "value must be integer number !")
    @NotNull (message = "can't be empty!")
//    @Pattern(regexp = "^[1-9]", message = "accepted decimal number")
    private Integer duration;
    private boolean promoted;
//        private String departureDate;
//        private String returnDate;
//    private Integer adultSpots;
//    private Integer childrenSpots;
//    private BigDecimal childrenPrice;
//    private String alimentation;


}
