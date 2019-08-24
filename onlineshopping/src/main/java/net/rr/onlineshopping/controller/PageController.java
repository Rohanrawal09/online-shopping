package net.rr.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Rohan Rawal
 *Base Controller
 */
@Controller
public class PageController {

	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("greeting","Welcome To Spring Web MVC");
		return modelAndView;
	}

}
