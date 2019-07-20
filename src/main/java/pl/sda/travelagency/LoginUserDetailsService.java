package pl.sda.travelagency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginUserDetailsService implements UserDetailsService {

    @Autowired
    private TravelerRepo travelerRepo;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<Traveler> traveler = travelerRepo.findByLogin(login);
        if (traveler.isPresent()) {
            return new LoginUser(traveler.get());
        }
        throw new UsernameNotFoundException(login);
    }
}
