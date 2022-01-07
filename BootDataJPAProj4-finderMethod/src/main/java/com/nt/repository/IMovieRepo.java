package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

	// select mname,year,rating from Movie where mname=?
	public List<Movie> findByMnameEquals(String name);

	// select mname,year,rating from Movie where mname=?
	public List<Movie> findByMname(String name);

	// select mname,year,rating from Movie where mname=?
	public Iterable<Movie> findByMnameIs(String name);

	// select mname,year,rating from Movie where mname like"R%",Starting"R"
	public List<Movie> findByMnameStartingWith(String initChar);

	// select mname,year,rating from Movie where mname like "%m",ending  with last char"m"
	public Iterable<Movie> findByMnameEndingWith(String lastChar);
	
	// select mname,year,rating from Movie where mname like "%am%" name me am hone wale 
		public Iterable<Movie> findByMnameContaining(String Char);
		
		// select mname,year,rating from Movie where mname like "%RRR%" name me am hone wale 
				public Iterable<Movie> findByMnameEqualsIgnoreCase(String name);
				
				
				//whilecard char methods
				// select mname,year,rating from Movie where mname like "R"% starting "R"alternate method  
				//select mname,year,rating from Movie where mname like "___"//3 letter movies
				//select mname,year,rating from Movie where mname like "%R%"//contaning letter R
				//select mname,year,rating from Movie where mname like "%R"//ending with R letter
				public Iterable<Movie> findByMnameLike(String Chars);// pass wild char while calling method

		}


