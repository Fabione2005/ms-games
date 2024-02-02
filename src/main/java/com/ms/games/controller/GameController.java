package com.ms.games.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {


	
	//Para este el body del request solo necesita email y password
	/*@GetMapping(value = "/auth",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserToken> login(@RequestBody UserToken user) {
		return service.loginAuth(user);
	}*/


	
}
