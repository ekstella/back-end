package hh.backend.hellothymeleaf.web;

import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayGreetings(@RequestParam(name = "name") String name, @RequestParam(name = 
    "age") int age, Model model ) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "hello";
    }
}
