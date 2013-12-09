package com.imoiseyenko.elstoref.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.imoiseyenko.elstoref.domain.inventoryItem.Player;
import com.imoiseyenko.elstoref.irepository.IPlayerRepository;

@Repository
public class PlayerRepository extends GenericRepository<Player> implements
		IPlayerRepository {

	@Override
	public List<Player> findAddPlayers () {

		TypedQuery<Player> query = em.createNamedQuery("Player.findAllPlayers",
				Player.class);

		return query.getResultList();
	}

}
