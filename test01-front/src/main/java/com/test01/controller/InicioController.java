package com.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
	
	@GetMapping({"/login","/"})
	public String login() {
		return "index";
	}
}
