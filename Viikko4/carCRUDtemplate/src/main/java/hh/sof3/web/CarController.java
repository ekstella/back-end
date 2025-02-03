package hh.sof3.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.sof3.domain.Car;
import hh.sof3.domain.CarRepository;

@Controller
public class CarController {

	@Autowired
	private CarRepository carRepository;

	// autolistaus
	@RequestMapping(value = "/allcars", method = RequestMethod.GET)
	public String getCars(Model model) {
		// List<Car> cars = (List<Car>) carReposirory.findAll();
		model.addAttribute("cars", carRepository.findAll()); // SQL SELECT  välitetään autolista templatelle model-olion avulla
		return "car-list"; // DispatherServlet saa tämän template-nimen ja kutsuu seuraavaksi
							// carlist.html-templatea,
							// joka prosessoidaan palvelimella
	}

	// tyhjän autolomakkeen muodostaminen
	@RequestMapping(value = "/newcar", method = RequestMethod.GET)
	public String getNewCarForm(Model model) {
		model.addAttribute("car", new Car()); // "tyhjä" auto-olio
		return "carform";
	}

	// autolomakeella syötettyjen tietojen vastaanotto ja tallennus
	@RequestMapping(value = "/savecar", method = RequestMethod.POST)
	public String saveCar(@ModelAttribute Car car) {
		carRepository.save(car); // SQL INSERT
		return "redirect:/allcars";
	}

}