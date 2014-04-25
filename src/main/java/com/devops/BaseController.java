package com.devops;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/")
public class BaseController {
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
 		model.addAttribute("message", "Dev Ops Web App using Maven Eclipse Tomcat");
 		return "index";
	}	
}