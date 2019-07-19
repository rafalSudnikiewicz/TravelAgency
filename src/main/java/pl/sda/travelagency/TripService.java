package pl.sda.travelagency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class TripService {

    @Autowired
    private CityRepo cityRepo;

    @Autowired
    private TripRepo tripRepo;

    @Autowired
    private TripToTripDTOBuilder tripToTripDTOBuilder;

    public void createNewTripBasicInfo(String destinationCity, int duration,
                                       BigDecimal adultPrice, String departureCity, boolean promoted) {
        City destination = new City(destinationCity);
        City departure = new City(departureCity);
        cityRepo.save(destination);
        cityRepo.save(departure);
        Trip trip = new Trip(destination, duration, adultPrice, departure, promoted);
        tripRepo.save(trip);
    }

    public void createNewTripFromDTO(AddTripDTO tripDTO) {
        Trip trip = new Trip();
        LocalDate departureDate=LocalDate.parse(tripDTO.getDepartureDate());
        LocalDate returnDate=LocalDate.parse(tripDTO.getReturnDate());

        trip.setDestinationCity(cityRepo.getOne(tripDTO.getDestinationCityId()));
        trip.setDepartureCity(cityRepo.getOne(tripDTO.getDepartureCityId()));
        int noOfDaysBetween = (int) DAYS.between(departureDate, returnDate);
        trip.setDuration(noOfDaysBetween);
        trip.setAdultPrice(tripDTO.getAdultPrice());
        trip.setPromoted(tripDTO.isPromoted());
        trip.setDepartureDate(departureDate);
        trip.setReturnDate(returnDate);
        tripRepo.save(trip);
    }


    public void updateTrip(TripDTO tripDTO) {
        Trip trip = tripToTripDTOBuilder.buildEntity(tripDTO);
        tripRepo.save(trip);
    }

    public Trip findTrip(Long id) {
        return tripRepo.getOne(id);
    }

    public List<Trip> findAllTrip() {
        return tripRepo.findAll();
    }

    public List<City> getCities() {
        return cityRepo.findAll();
    }

    public void deleteTripById(Long id) {
        tripRepo.delete(this.findTrip(id));
    }


}
