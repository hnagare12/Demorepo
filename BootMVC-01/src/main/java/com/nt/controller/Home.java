package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	@RequestMapping("/dd")
	public String home() {
		return "demo";
	}

}
