package pl.sda.travelagency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepo tripRepo;

    @Autowired
    private TripToTripDTOBuilder tripToTripDTOBuilder;

    public void createNewTripBasicInfo(String destinationCity, int duration,
                                       BigDecimal adultPrice, String departureCity, boolean promoted) {
        Trip trip = new Trip(destinationCity,duration,adultPrice,departureCity,promoted);
//        trip.setDestinationCity(destinationCity);
//        trip.setDuration(duration);
//        trip.setAdultPrice(adultPrice);
//        trip.setDepartureCity(departureCity);
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

    public void deleteTripById(Long id){
        tripRepo.delete(this.findTrip(id));
    }




}
