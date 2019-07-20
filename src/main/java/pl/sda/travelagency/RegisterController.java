package pl.sda.travelagency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegisterController {

    @Autowired
    private TravelerService travelerService;
    @GetMapping("/register")
    public ModelAndView register() {
//        ModelAndView m = new ModelAndView();
////        m.setViewName("register");
////        return m;
        return new ModelAndView("register");
    }
    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute Traveler user){
        travelerService.save(user);
        return new ModelAndView("login");
    }
}
