package com.imoiseyenko.elstoref.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.imoiseyenko.elstoref.domain.inventoryItem.Player;
import com.imoiseyenko.elstoref.irepository.IPlayerRepository;
import com.imoiseyenko.elstoref.iservice.IPlayerService;

@Service
public class PlayerService implements IPlayerService {

	@Autowired
	private IPlayerRepository playerRepository;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Player createPlayer (Player player) {

		return playerRepository.create(player);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public Player findPlayerById (Object id) {

		return playerRepository.findById(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Player updatePlayer (Player player) {

		return playerRepository.update(player);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void deletePlayerById (Object id) {

		playerRepository.deleteById(id);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public List<Player> findAllPlayers () {

		return playerRepository.findAddPlayers();
	}

}
