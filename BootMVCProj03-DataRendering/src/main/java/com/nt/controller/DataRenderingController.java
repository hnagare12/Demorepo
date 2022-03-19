package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Product;

@Controller
public class DataRenderingController {

	/*@GetMapping("/report")
 public String ShowReportDat(Map<String, Object>map) {
	//add  simple values as the model attributs
	map.put("name", "raja");
	map.put("age", 30);
	map.put("add", "hyd");
	//return lvn
	return "show_report";
}
*/
	
/*	@GetMapping("/report")
	public String ShowReportData(Map<String,Object>map) {
		//add simple value as the model attributes(Gentrally these values are not hardcode
		//static value these value will come from DB s/w through DAO service class)
		map.put ("fevColors", new String[] {"red","green","yellow","white"});
		map.put("nickName",List.of("raja","silky","raj","aniket") );
		map.put("phonNumber", Set.of(999989L,88888767L,6767676767L));
		map.put("idDetails",Map.of("aadhar",565443L,"voterid",7878787L,"panNo","677H36"));
		//return LVN
		return "show_report";
		
	}
	*/
	/*
	@GetMapping("/report")
	public String ShowReportData(Map<String , Object>map) {
		//create model class obj data(generally this object come DAO ,service classes)
		//having db table recorded
		Product prod=new Product(1001,"sofa",56700.0, 1.0);
		map.put("prodData", prod);
		return "show_report";
	}
	*/
	@GetMapping("/report")
	public String ShowReportData(Map<String , Object>map) {
		// Create list class mode object as the model attributes
		List<Product> list=List.of( new Product( 101,"sofa",56700.0,2.0),
				                                           new Product(102,"tv",4000.0,1.0));
		map.put("prodList", list);
		return "show_report";
	
}
}