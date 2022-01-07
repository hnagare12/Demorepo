package com.nt.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;


@Service("movieServices")
public class MovieMgmtServiceImpl implements IMovieMgmtService {
	@Autowired
	private IMovieRepo movieRepo;//Has-A property

	@Override
	public String registerMovive(Movie movie) {
		System.out.println("InMemory Proxu class name::"+movieRepo.getClass()+"....."+Arrays.toString(movieRepo.getClass().getInterfaces()));
		//use repo
		System.out.println("before saving::"+movie);
		Movie movie1=movieRepo.save(movie);
		System.out.println("after saving::"+movie1);
		return "Movie is registered with the Id Value:;"+movie1.getMid();
	}

}
