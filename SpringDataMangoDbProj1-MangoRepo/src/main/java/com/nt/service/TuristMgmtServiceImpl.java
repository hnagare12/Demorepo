package com.nt.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.documents.Tourist;
import com.nt.repo.ITouristRepo;
@Service("touristService")
public class TuristMgmtServiceImpl implements ITouristMgmtService {
	@Autowired
private ITouristRepo touristRepo ;
	@Override
	public String registerTourist(Tourist tourist) {
		return"Documennt is saved with id value::"+touristRepo.insert(tourist).getId();
	}
}

	