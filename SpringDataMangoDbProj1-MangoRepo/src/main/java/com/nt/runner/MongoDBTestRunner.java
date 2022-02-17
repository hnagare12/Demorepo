package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.documents.Tourist;
import com.nt.service.ITouristMgmtService;

@Component
public class MongoDBTestRunner implements CommandLineRunner {
	@Autowired
private ITouristMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			Tourist tourest =new Tourist(null,"Ramesh","USA", 45.0f,"345654A77",999987L,true);
			/*Tourist tourest =new Tourist();
			tourest.setTouristName("raju");
			tourest.setNativePlace("nepal");*/
			
			String result=service.registerTourist(tourest);
			System.out.println(result);
					}
		catch (Exception e) {
	e.printStackTrace();
		}

	}

}
