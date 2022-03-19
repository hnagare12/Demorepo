package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.IWishService;

@Controller
public class WishMessageOperationController {

	@Autowired
	private IWishService service;

	@RequestMapping("/home")
	public String ShowHomePage() {
		//logical view name(LVN)
		return "welcome";
	}
		@RequestMapping("/wish")
		public ModelAndView fetchWishMessage(){
			String msg=service.generateWishMessage();
			ModelAndView mav=new ModelAndView();
		 mav.addObject("wMsg",msg);
		 mav.setViewName("show_result");
		return mav;
		
	}
}
