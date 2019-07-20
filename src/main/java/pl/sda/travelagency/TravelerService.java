package pl.sda.travelagency;

import java.util.Optional;

public interface TravelerService {

    void save(Traveler user);

    Optional<Traveler> findByLogin(String login);
}


