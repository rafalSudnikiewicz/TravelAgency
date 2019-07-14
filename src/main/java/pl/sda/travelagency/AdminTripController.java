package pl.sda.travelagency;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.math.BigDecimal;

@Controller
@RequestMapping("/admin")
@Getter
public class AdminTripController {

    @Autowired
    private TripService tripService;


//    @GetMapping("/addtrip")
//    public ModelAndView addTrip(
////            @RequestParam
//                    String destinationCity,
////                                @RequestParam
//                                        int duration,
////                                @RequestParam
//                    BigDecimal adultPrice,
////                                @RequestParam
//                    String departureCity,
////                                @RequestParam
//                    boolean promoted) {
//
//
//        ModelAndView m = new ModelAndView();
//        m.setViewName("addTrip");
//        m.addObject("trips", tripService.findAllTrip());
//        m.addObject("cities", tripService.getCities());
//        this.addTrip2(destinationCity,duration,adultPrice,departureCity,promoted);
//
//        return m;
//
//    }

//    @PostMapping
//    public void addTrip(@RequestParam String destinationCity,
//                        @RequestParam int duration,
//                        @RequestParam BigDecimal adultPrice,
//                        @RequestParam String departureCity,
//                        @RequestParam boolean promoted) {
//        tripService.createNewTripBasicInfo(destinationCity, duration, adultPrice, departureCity, promoted);
//    }

    @GetMapping("/trips")
    public ModelAndView getMain() {
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        m.addObject("trips", tripService.findAllTrip());
        return m;
    }

    @DeleteMapping("/deletetrip")
    public void deleteTripById(Long id) {
        tripService.deleteTripById(id);
    }

    @GetMapping(value = "/addtrip")
    public String registerForm(Model model) {
        model.addAttribute("tripDTOdata", new AddTripDTO());
        model.addAttribute("cities", tripService.getCities());

        return "addTrip";
    }

    @PostMapping(value = "/addtrip")
    public String registerEffect(@ModelAttribute(name = "tripDTOdata") @Valid AddTripDTO tripDTOdata, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("cities", tripService.getCities());
            return "addtrip";
        }

            tripService.createNewTripFromDTO(tripDTOdata);

        model.addAttribute("tripDTOdata", tripDTOdata);
        return "index";
    }




}
