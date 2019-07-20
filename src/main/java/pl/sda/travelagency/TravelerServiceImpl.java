package pl.sda.travelagency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TravelerServiceImpl implements TravelerService {

    @Autowired
    private TravelerRepo travelerRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void save(Traveler traveler) {
        traveler.setPassword(passwordEncoder.encode(traveler.getPassword()));
        travelerRepo.save(traveler);
    }

    @Override
    public Optional<Traveler> findByLogin(String login) {
        return travelerRepo.findByLogin(login);
    }

}
