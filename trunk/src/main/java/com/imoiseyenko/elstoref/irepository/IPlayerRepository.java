package com.imoiseyenko.elstoref.irepository;

import java.util.List;

import com.imoiseyenko.elstoref.domain.inventoryItem.Player;

public interface IPlayerRepository extends IGenericRepository<Player> {

	public List<Player> findAddPlayers ();
}
