package com.nt.documents;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist implements Serializable {
	@Id
	private String id;
	private String touristName;
	private String nativePlace;
	private Float age;
	private String passportNo;
	private Long contactNo;
	private boolean isVaccinated;

}
