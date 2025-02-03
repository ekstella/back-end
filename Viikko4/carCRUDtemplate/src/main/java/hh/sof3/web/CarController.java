package hh.sof3.web;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.sof3.domain.Car;

@Controller
public class CarController {
	
	// autolistaus
		@RequestMapping(value = "/allcars", method = RequestMethod.GET)
		public String getCars(Model model) {
		
			List<Car> cars = new ArrayList<Car>(); // ei vielä haeta tietokannasta autoja -> luodaan tyhjä lista
			cars.add(new Car("Tesla", 2016)); // lisätään 1. auto listaan
			cars.add(new Car("Saab", 1986)); // lisätään 2. auto listaan
			model.addAttribute("cars", cars); // välitetään autolista templatelle model-olion avulla
			return "car-list"; // DispatherServlet saa tämän template-nimen ja kutsuu seuraavaksi carlist.html-templatea,
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
	public String saveCar(@ModelAttribute Car car, Model model) {
		// ei osata vielä tallentaa tietokantaan lomakkeelta syötetyn auton tietoja
		model.addAttribute("car", car);
		return "carresult";
	}

	

}