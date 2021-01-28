package com.au.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.au.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam(value = "name") String name) {
		
		System.out.println("Came to Inside controller : " + name);
		sampleService.sampleMethod(name);
		
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("message", "Nice to meet you ");
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/hello/{id}")
	public ModelAndView helloWithId(@PathVariable("id") String id) {
		
		System.out.println("From ID controller : " + id);
		try {
			sampleService.sampleMethod(id);
		} catch (RuntimeException e) {
			System.out.println(e);
		}
		
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("message", "Nice to meet you ");
		mv.addObject("name", id);
		return mv;
	}

}
