package net.koreate.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {		
		return "home";
	}
	
	@GetMapping("/testJavascript")
	public String testJavascript() {		
		return "javascript";
	}
	
	@GetMapping("/ajaxTest")
	public String ajaxtTest() {
		return "ajaxTest"; 
	}
}
