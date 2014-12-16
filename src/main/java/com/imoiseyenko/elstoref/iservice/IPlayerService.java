package com.imoiseyenko.elstoref.iservice;

import java.util.List;

import com.imoiseyenko.elstoref.domain.inventoryItem.Player;

public interface IPlayerService {

	public Player createPlayer (Player player);
	
	public Player findPlayerById (Object id);
	
	public Player updatePlayer (Player player);
	
	public void deletePlayerById (Object id);
	
	public List<Player> findAllPlayers ();
}
