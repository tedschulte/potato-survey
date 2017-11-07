package com.libertymutual.goforcode.hell_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private int russettCount; 
	private int goldenCount;
	private int sweetCount;

	@RequestMapping("/")
	public String defaultPage() {
		return "potato";
	}

	@RequestMapping("/twice-baked")
	public ModelAndView twiceBaked() {
		ModelAndView carbs = new ModelAndView();
		carbs.setViewName("spuds");
		carbs.addObject("variety", "fingerling");
		carbs.addObject("temperature", "250");

		return carbs;
	}

	@RequestMapping("/survey")
	public ModelAndView survey(String answer) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("resuts");
		mv.addObject("user response", answer);
		
		if (answer.equals("Sweet")) {
			
			sweetCount = sweetCount +1;
		}
		
		if (answer.equals("Russet")) {
			russettCount = russettCount + 1;
		}
		
		if (answer.equals("Golden")) {
			goldenCount = goldenCount +1;
		}
		
		mv.addObject("sweetCount", sweetCount);
		mv.addObject("russettCount", russettCount);
		mv.addObject("goldenCount", goldenCount);
		
		return mv;
	}

}
