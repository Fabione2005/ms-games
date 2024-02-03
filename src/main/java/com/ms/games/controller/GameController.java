package com.ms.games.controller;


import com.ms.games.exception.GenericException;
import com.ms.games.model.bean.Game;
import com.ms.games.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;

@RestController
@RequestMapping(value = "/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

	@GetMapping(value = "/search",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getGame(@RequestParam("name") String name) {

        try{
            Game game = gameService.getGame(name);
            return ResponseEntity.ok(game);
        }
        catch(GenericException e){
            return new ResponseEntity<>(e.getMessage(),e.getStatus());
        }
	}

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addUser(@RequestBody Game request) {
        try{
            String response = gameService.addGame(request);
            return ResponseEntity.ok(response);
        }
        catch(GenericException e){
            return new ResponseEntity<>(e.getMessage(),e.getStatus());
        }
    }
	
}
