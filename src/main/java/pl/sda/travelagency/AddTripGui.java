//package pl.sda.travelagency;
//
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.textfield.TextField;
//import com.vaadin.flow.component.html.Label;
//import com.vaadin.flow.router.Route;
//import com.vaadin.flow.component.combobox.ComboBox;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.math.BigDecimal;
//
//@Route("post")
//public class AddTripGui extends VerticalLayout {
//
//    private AdminTripController adminTripController;
//
//    private Button button = new Button("add trip");
//    private TextField duration = new TextField("Duration");
//    private TextField price = new TextField("Price");
//    private Label confirmationLabel = new Label();
//
//    private ComboBox<City> departure = new ComboBox<>();
//    private ComboBox<City> destination = new ComboBox<>();
//
//
//
//
//
////departure.addValueChangeListener(event ->
////
////    {
////        if (event.getSource().isEmpty()) {
////            message.setText("No browser selected");
////        } else {
////            message.setText("Selected browser: " + event.getValue());
////        }
////    });
//
//
//    @Autowired
//    public AddTripGui(AdminTripController adminTripController) {
//        this.adminTripController = adminTripController;
//
//        departure.setItems(adminTripController.getTripService().getCities());
//        destination.setItems(adminTripController.getTripService().getCities());
//
//        button.addClickListener(ClickEvent -> {
//            adminTripController.addTrip(destination.getValue().getName(),Integer.valueOf(duration.getValue()),
//                    BigDecimal.valueOf(Double.parseDouble(price.getValue())),departure.getValue().getName(),true);
//            confirmationLabel.setText("Added successful");
//
//        });
//        add(duration);
//        add(departure);
//        add(destination);
//        add(price);
//        add(button);
//        add(confirmationLabel);
//
//    }
//
//}
