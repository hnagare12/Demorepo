package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMovieRepo;

@Component
public class finderMethodsTestRunners  implements  CommandLineRunner {
@Autowired
	private IMovieRepo repo ;

@Override
public   void run(String...args)throws Exception{
	repo.findByMnameEquals("Anthim").forEach(System.out::println);
	
	System.out.println("..........................");
	repo.findByMname("RRR").forEach(System.out::println);
	
	System.out.println("..........................");
	repo.findByMname("Don").forEach(System.out::println);
	
	System.out.println("..........................");
	repo.findByMnameStartingWith("R").forEach(System.out::println);
	
	System.out.println("..........................");
	repo.findByMnameStartingWith("D").forEach(System.out::println);
	
	System.out.println("..........................");
	repo.findByMnameEndingWith("m").forEach(System.out::println);
	
	System.out.println("..........................");
	repo.findByMnameContaining("am").forEach(System.out::println);
	
	System.out.println("..........................");
	repo.findByMnameEqualsIgnoreCase("RrR").forEach(System.out::println);
	
	System.out.println("..........................");
	//repo.findByMnameLike("R").forEach(System.out::println);
	//repo.findByMnameLike("__").forEach(System.out::println);
	//repo.findByMnameLike("R%").forEach(System.out::println);
	//repo.findByMnameLike("%R").forEach(System.out::println);
	repo.findByMnameLike("%R%").forEach(System.out::println);
}

}
