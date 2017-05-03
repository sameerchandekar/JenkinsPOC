package com.jenkinspoc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping(value = "/showHome")
	public ModelAndView showHome(HttpServletRequest request){
		System.out.println("inside");
		ModelAndView mav = new ModelAndView("page.home");
		return mav;
		
	}
}
