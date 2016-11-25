package com.tju.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

	@RequestMapping("/login")
	public String login(@RequestParam(value = "name", required = false, defaultValue = "World") 
	String name, Model model) {
		model.addAttribute("name", name);
		return "login";
	}

	@RequestMapping("/info")
	public String info(@RequestParam(value = "userName", required = false, defaultValue = "") 
	String userName, Model model) {

		return "info";
	}
}