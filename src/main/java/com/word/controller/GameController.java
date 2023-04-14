package com.word.controller;


import com.word.model.Game;
import com.word.model.dto.GameForPlayerDTO;
import com.word.service.game.GameService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jesgarsal on 19/04/17.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/game")
public class GameController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameController.class);

    private final GameService gameService;

    @RequestMapping(value = "/{secretWord}/{visibleWord}", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public Game getGame(@PathVariable("visibleWord") String visibleWord) {
        return gameService.startNewGame(visibleWord);
    }

}
