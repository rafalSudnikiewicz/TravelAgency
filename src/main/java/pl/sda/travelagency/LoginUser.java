package pl.sda.travelagency;


import org.springframework.security.core.userdetails.User;

import java.util.Collections;

public class LoginUser extends User {
    public LoginUser(Traveler traveler) {
        super(traveler.getLogin(), traveler.getPassword(), Collections.emptyList());
    }

}
