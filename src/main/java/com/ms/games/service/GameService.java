package com.ms.games.service;


import com.ms.games.model.bean.Game;

public interface GameService
{
	Game getGame(String name);

	String addGame(Game game);

}
