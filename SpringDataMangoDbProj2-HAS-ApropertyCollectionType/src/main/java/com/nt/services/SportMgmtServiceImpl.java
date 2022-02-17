package com.nt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Player;
import com.nt.repository.IMedalRepo;
import com.nt.repository.IPlayerRepo;
import com.nt.repository.ISportRepo;

@Service("sportService")
public class SportMgmtServiceImpl implements ISportMgmtService {
@Autowired
	private IPlayerRepo playerRepo;
@Autowired
	private IMedalRepo medalRepo;
@Autowired
	private ISportRepo sprotRepo;
	
	
	
	@Override
	public String registerPlayerWithSportsAndMedals(Player player) {
	
		return "PlayerWith Sports And Medals info save with "+playerRepo.save(player).getPid()+"Id value";
	}

	@Override
	public List<Player> fetchAllPlayersInfo() {
		
		return playerRepo.findAll();
	}

}
