package com.nt.controller;


import java.io.PrintWriter;
import java.nio.channels.NonWritableChannelException;
import java.util.Date;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishService;
@Controller
public class WishMsgController {
	@Autowired
	private IWishService  service;
	
	/*@RequestMapping("/")
	public  String showHomePage() {
		//return LVN
		return "welcome";
	}*/
	@RequestMapping
	public  String showHomePage() {
		//return LVN
		return "welcome";
	}
	
	@RequestMapping("/wish")
	public  String   fetchWishMessage(HttpServletResponse res)  throws Exception{
		String msg=service.generateWishMessage();
		
		PrintWriter pw=res.getWriter();
		pw.println("<b> wish message is ::"+msg+"</b><br>");
		pw.println("<b> sys date and time ::"+new Date()+"</b>");
		return null;
	}
	@RequestMapping("/report")
	public String ShowReport() throws Exception{
		return "show_report";
	}
	@RequestMapping({"/report2","/report3"})
	public String ShowReport2() throws Exception{
		return "show_report";
	}
	@RequestMapping("/Report")
	public String ShowReport1() throws Exception{
		return "show_report1";
	}
	}