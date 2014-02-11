package com.sangupta.evenstar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	
	/**
	 * Show the home page for the user
	 * 
	 * @return
	 */
	@RequestMapping("index")
	public ModelAndView home() {
		return new ModelAndView(".index");
	}

}
