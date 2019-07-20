package pl.sda.travelagency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TravelerRepo extends CrudRepository<Traveler,Long> {
    Optional<Traveler> findByLogin(String login);
}
