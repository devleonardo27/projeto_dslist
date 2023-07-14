package br.com.projeto.dslist.controllers;

import java.util.List;

import br.com.projeto.dslist.dto.ReplacementDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.projeto.dslist.dto.GameListDTO;
import br.com.projeto.dslist.dto.GameMinDTO;
import br.com.projeto.dslist.services.GameListService;
import br.com.projeto.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameListService gameListService;

  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameListDTO> findAll() {
    return gameListService.findAll();
  }

  @GetMapping(value = "/{listId}/games")
  public List<GameMinDTO> findByList(@PathVariable Long listId) {
    return gameService.findByList(listId);
  }

  @PostMapping(value = "/{listId}/replacement")
  public void move(@PathVariable Long listId,@RequestBody ReplacementDTO body) {
    gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
  }

}
