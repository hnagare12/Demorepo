package com.nt.controller;


import java.util.Date;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishService;

@Controller
public class WishMsgController {
	@Autowired
	private IWishService  service;
	
	@RequestMapping("/home")
	public  String showHomePage() {
		//return LVN
		return "welcome";
	}
	
	@RequestMapping("/wish")
	public  String   fetchWishMessage(Map<String,Object> map) {
		System.out.println("shared Memory obj class name::"+map.getClass());
		//use service
		String  msg=service.generateWishMessage();
		 //  keep  data in model attributes
		map.put("wMsg", msg);
		map.put("sysDate",new Date());
		//return MAV
		return "show_result";
	}
	}