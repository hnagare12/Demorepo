package com.nt.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
	@Id
	private Integer pid;
	private String pname;
	private String paddres;
	private Set<Sport>sport;
	private Map<String, Medal>medal;
	
	

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", paddres=" + paddres + "]";
	} 
	
	
	
	
	
	
}
