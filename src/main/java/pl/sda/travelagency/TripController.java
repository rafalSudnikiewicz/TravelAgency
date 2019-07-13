package pl.sda.travelagency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TripController {

    private int counter;

    @Autowired
    private TripService tripService;


    @GetMapping("/trips")
    public ModelAndView getMain() {
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        initTrip();
        m.addObject("trips", tripService.findAllTrip());
        return m;
    }

    @GetMapping("/promoted")
    public ModelAndView getPromoted() {
        ModelAndView m = new ModelAndView();
        m.setViewName("promoted");
//        initTrip();
        m.addObject("trips", tripService.findAllTrip());
        return m;
    }

    public void initTrip() {
        if (counter < 1) {
            for (int i = 1; i <= 10; i++) {
                tripService.createNewTripBasicInfo("city" + i, i,
                        BigDecimal.valueOf(i * 155.5), "departure" + i, i % 2 == 0);
            }
            counter++;
        }
    }


}



