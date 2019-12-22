package kr.co.vetgate.pet.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String home(Locale locale, Model model) {
        
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
          
        String formattedDate = dateFormat.format(date);
          
        model.addAttribute("serverTime", formattedDate );
          
        return "index";
    }

}
