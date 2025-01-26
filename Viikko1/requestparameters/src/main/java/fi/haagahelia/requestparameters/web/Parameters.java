package fi.haagahelia.requestparameters.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Parameters {

    @RequestMapping("/hello")
    public String name(@RequestParam String name,
            @RequestParam String location) {
        return "Welcome to the " + location + " " + name;
    }
}
