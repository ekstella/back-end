package hh.sof03.ekaspringprojekti.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	
   /* suoritetaan pyynnöllä http://localhost:8080/mitävaan */
   @RequestMapping(value = "*", method = RequestMethod.GET)
   public String sayHello() {
	   return "Hello World and ...!!";
   }
   
   /* suoritetaan pyynnöllä
    * http://localhost:8080/hello?firstname=Matti&lastname=Mattila
    */
   
   @RequestMapping(value = "/hello", method = RequestMethod.GET)
   public String helloYou(@RequestParam(name = "firstname") String fname, 
		 @RequestParam(name = "lastname", required = false) String lname) {
	   return "Hello " + fname + " " + (lname != null ? lname : "") + "!"; 
   } 

   
   
   
}
