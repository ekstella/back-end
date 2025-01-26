package hh.sof03.modelandview.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// ei @ResponseBody-annotaatiota
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayGreetings(@RequestParam(value = "name") String name, Model model){
		model.addAttribute("name", name); // "name" is keyword for HashMap
		return "hello";  // hello.html
		
	}

}
