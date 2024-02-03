package com.ms.games.exception;

import org.springframework.http.HttpStatus;

public class GameNotFoundException extends GenericException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1189460730196188968L;

	public GameNotFoundException() {
		super("Not game found", HttpStatus.NOT_FOUND);
	}

}
