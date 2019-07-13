package pl.sda.travelagency;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepo extends JpaRepository<Trip,Long> {
}
