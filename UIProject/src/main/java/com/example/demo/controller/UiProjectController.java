package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myapp")
public class UiProjectController {
	
	@RequestMapping(value="/{home}", method=RequestMethod.GET)
	public String reacttestapp(@PathVariable("home") String home, Model model) {
		return "hellociapp";		
	}
}
