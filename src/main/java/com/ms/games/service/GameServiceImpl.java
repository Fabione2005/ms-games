package com.ms.games.service;


import com.ms.games.exception.GameException;
import com.ms.games.exception.GameNotFoundException;
import com.ms.games.model.bean.Game;
import com.ms.games.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

	private final GameRepository repository;
	@Override
	public Game getGame(String name) {

		Game gameFound = repository.findByName(name).orElseThrow(GameNotFoundException::new);

		return gameFound;
	}

	@Override
	public String addGame(Game game) {

		repository.findByName(game.getName()).ifPresent(us -> {
			throw new GameException("This game already exists", HttpStatus.CONFLICT);
		});

		repository.save(game);

		return "Game saved successfully";
	}
}
