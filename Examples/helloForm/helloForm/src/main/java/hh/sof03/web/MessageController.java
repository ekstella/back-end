package hh.sof03.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.sof03.domain.Message;

@Controller
public class MessageController {

	// Empty message form
    @RequestMapping(value="/message", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("message", new Message());
        return "messageform"; // messageform.html
    }

    // Handing input from message form
    @RequestMapping(value="/message", method=RequestMethod.POST)
    public String greetingSubmit( @ModelAttribute("message") Message msg, Model model) {
		model.addAttribute("message", msg);
		return "result";	// result.html
    }

}