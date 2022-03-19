package com.nt.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;
@Service
public class WishServiceImpl implements IWishService {

	@Override
	public String generateWishMessage() {
		//system date and time
		LocalDateTime idl=LocalDateTime.now();
		//get current houre and date
		int hour=idl.getHour();//24 hour formate
		if(hour<=12)
			return"Good Morning";
		else if(hour<=16)
			return"Good Evening";
		else 
			return"Good Night";
		}

}
