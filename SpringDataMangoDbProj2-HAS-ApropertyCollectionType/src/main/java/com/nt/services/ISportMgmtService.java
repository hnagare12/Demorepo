package com.nt.services;

import java.util.List;

import com.nt.document.Player;

public interface ISportMgmtService {
public String registerPlayerWithSportsAndMedals(Player player);
public List<Player>fetchAllPlayersInfo();

}
