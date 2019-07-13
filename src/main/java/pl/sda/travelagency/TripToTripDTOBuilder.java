package pl.sda.travelagency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TripToTripDTOBuilder {

    @Autowired
    private CityRepo cityRepo;

    public TripDTO buildDTO(Trip trip) {

        return TripDTO.builder()
                .adultPrice(trip.getAdultPrice())
                .adultSpots(trip.getAdultSpots())
                .alimentation(trip.getAlimentation().name())
                .childrenPrice(trip.getChildrenPrice())
                .childrenSpots(trip.getChildrenSpots())
                .departureDate(trip.getDepartureDate().toString())
                .duration(trip.getDuration())
                .promoted(trip.isPromoted())
                .returnDate(trip.getReturnDate().toString())
                .departureCityId(Optional.ofNullable(trip.getDepartureCity()).map(c->c.getId()).orElse(null))
                .destinationCityId(Optional.ofNullable(trip.getDestinationCity()).map(c->c.getId()).orElse(null))
                .build();

    }

    public Trip buildEntity(TripDTO tripDTO) {
        Trip trip = new Trip();

        trip.setPromoted(tripDTO.isPromoted());
        trip.setAdultPrice(tripDTO.getAdultPrice());
        trip.setAdultSpots(tripDTO.getAdultSpots());
//        trip.setAlimentation(new Alimentation(tripDTO.getAlimentation()));

        trip.setChildrenPrice(tripDTO.getChildrenPrice());
        trip.setChildrenSpots(tripDTO.getChildrenSpots());
        trip.setDepartureDate(LocalDate.parse(tripDTO.getDepartureDate()));
        trip.setReturnDate(LocalDate.parse(tripDTO.getReturnDate()));
        trip.setDepartureCity(Optional.ofNullable(tripDTO.getDepartureCityId()).map(cityRepo::getOne).orElse(null));
        trip.setDestinationCity(Optional.ofNullable(tripDTO.getDestinationCityId()).map(cityRepo::getOne).orElse(null));


        return trip;
    }

}
