package pl.sda.travelagency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private List<Trip> trips = new ArrayList<>();


    @GetMapping("/trips")
    public ModelAndView getMain() {
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        initTrip();
        m.addObject("trips", trips);
        return m;
    }

    @GetMapping("/promoted")
    public ModelAndView getPromoted() {
        ModelAndView m = new ModelAndView();
        m.setViewName("promoted");
//        initTrip();
        m.addObject("trips", trips);
        return m;
    }

    public void initTrip() {
        if (trips.size() < 10) {
            for (int i = 1; i <= 10; i++) {
                trips.add(new Trip(new City("city" + i), i,
                        BigDecimal.valueOf(i * 155.5), new City("departure" + i)));
                if (i % 2 == 0) {
                    trips.get(i - 1).setPromoted(true);
                }
            }
        }




    }


}
