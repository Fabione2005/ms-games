package com.ms.games.exception;

import org.springframework.http.HttpStatus;

public class GameException extends GenericException{

	/**
	 *
	 */
	private static final long serialVersionUID = 6664020609555381727L;

	public GameException(String message, HttpStatus status) {
		super(message, status);
	}


	
}
