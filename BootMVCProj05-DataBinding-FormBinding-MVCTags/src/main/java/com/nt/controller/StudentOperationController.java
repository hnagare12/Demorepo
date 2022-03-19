package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;
@Controller
public class StudentOperationController {

	@GetMapping("/")
	public String ShowHomePage(){
		//return lvn(form page --->welcome.jsp
		return "welcome";
	}
	
	@GetMapping("/register")
	public String ShoeStudentFromPage(@ModelAttribute("stud")Student st) {
     st.setAvg(1.0f);//generally comes form Db in case edit usecses
		//return lvn(form page --->student_register.jsp
		return"student_register";
	}
	
	@PostMapping("/register")
	public String registerStudent(Map<String, Object>map,
			@ModelAttribute("stud")Student st) {
		System.out.println(st);
		return"show_result";
	}
}
