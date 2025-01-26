package hh.backend.autoprojektini.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

import hh.backend.autoprojektini.domain.Car;

@Controller
// @ResponseBody kommentoidaan pois, jotta controllermethodin palauttava merkkijono
// tulkitaan tyhmeleaf-templateksi, jota pitää alkaa prosessoimaan

public class CarController {

    // http://localhost:8080/allcars, jossa endpoint /allcars

@GetMapping("/allcars") 
public String getAllCars(Model model) {
    // return "All Cars"; 
    // ei vielä autoja sisältävää tietokantaa käytössä, niin
    List<Car> cars = new ArrayList<Car>(); // luodaan tyhjä autolista
    cars.add(new Car("Tesla", 2015));
    cars.add(new Car("Saab", 1985));
    model.addAttribute("cars", cars); // model on hashmap
    return "carlist"; // carlist.html
}

}
