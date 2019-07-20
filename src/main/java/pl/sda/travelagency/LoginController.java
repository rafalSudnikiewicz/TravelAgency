package pl.sda.travelagency;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping("/login")
    public ModelAndView getMain() {
        ModelAndView m = new ModelAndView();
        m.setViewName("login");
        return m;
    }
}
